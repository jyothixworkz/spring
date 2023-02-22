package com.dextris.dextris.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

@Component
public class JwtUtil {
    private static final String SECRET_KEY = "manoj";
    private static final int TOKEN_VALIDITY=3600 * 5;

    public JwtUtil() {
        System.out.println(this.getClass().getSimpleName());
    }

    public String getUserNameFromToken(String token) {
        System.out.println(" inside the getUserNameFromToken method cos");
        return getClaimFromToken(token, Claims::getSubject);

    }

    private <T> T getClaimFromToken(String token, Function<Claims, T> claimResolver) {
        System.out.println(" inside the getClaimFromToken method cos");

        final Claims claims = getAllClaimsFromToken(token);
        return claimResolver.apply(claims);

    }

    private Claims getAllClaimsFromToken(String token) {

        System.out.println(" inside the getAllClaimsFromToken method cos");


        return Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody();
    }

    public boolean validateToken(String token, UserDetails userDetails) {
        System.out.println(" inside the validateToken method cos");

        String userName = getUserNameFromToken(token);
        return ( userName.equals(userDetails.getUsername())&& !isTokenExpired(token) );
    }

    private boolean isTokenExpired(String token) {
        System.out.println(" inside the isTokenExpired method cos");


        final Date expirationDate = getExpirationDateFromToken(token);
        return expirationDate.before(new Date());

    }

    private Date getExpirationDateFromToken(String token) {

        System.out.println(" inside the getExpirationDateFromToken method cos");

        return getClaimFromToken(token, Claims::getExpiration);
    }
    public  String generateToken(UserDetails userDetails){
        System.out.println(" inside the generateToken method cos");



        Map<String,Object> claims=new HashMap();
        return Jwts.builder().setClaims(claims).setSubject(userDetails.getUsername())
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis()+TOKEN_VALIDITY*1000)).signWith(SignatureAlgorithm.HS512,SECRET_KEY).compact();
    }
}
