package com.xworkz.user.controller;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLConnection;
import java.nio.file.Files;
import java.util.List;
import java.util.Optional;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.user.dto.UserDTO;
import com.xworkz.user.service.UserService;

@Controller
@RequestMapping("/signin")
public class SingInController {
	private Integer count = 0;
	@Autowired
	@Qualifier("userServiceImpl")
	private UserService service;

	@GetMapping
	String onFindByMailAndSecurity(UserDTO dto) {

		Optional<List<UserDTO>> mailAndSecurity = service.validateAndFindByMailAndSecurity(dto.getMailId(),
				dto.getSecurity(), dto);

		if (mailAndSecurity.isPresent()) {
			List<UserDTO> list = mailAndSecurity.get();
			System.out.println(list + "(*/ω＼*)(*/ω＼*)(*/ω＼*)(*/ω＼*)(*/ω＼*)(*/ω＼*)(*/ω＼*)(*/ω＼*)");
			System.out.println(" data is there from controller");
			UserDTO userDTO = list.get(0);

			if (userDTO.getStatus().equals("blocked")) {

				System.out.println(" your accout is blocked");
				return "SignIn";
			} else {
				System.out.println(" your registration is complited");
				return "Welcome";
			}
		} else {
			this.count++;
			if (count == 4) {

				System.out.println(" your count is blocked");
			}

			System.out.println("data is not there from the controller");

			return "Welcome";
		}
	}

	@PostMapping
	String onSignIn(UserDTO dto) {

		return onFindByMailAndSecurity(dto);
	}

	@GetMapping(value = { "/water", "/signin/water" })
	void sendFile(@RequestParam String fileName, HttpServletResponse response) throws IOException {
		System.out.println(" running in send file........." + fileName);

		File file = new File("C://Users//Dell//Desktop//user/" + fileName);
		String mimeType = URLConnection.guessContentTypeFromName(file.getName());
		response.setContentType(mimeType);
		try (ServletOutputStream stream = response.getOutputStream()) {

			stream.write(Files.readAllBytes(file.toPath()));
		}
		// return "fileName";
	}
}
