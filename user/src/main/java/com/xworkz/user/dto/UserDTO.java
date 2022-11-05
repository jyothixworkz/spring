package com.xworkz.user.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "user_details")
@NamedQueries({ @NamedQuery(name = "findByMail", query = "select info from UserDTO info where info.mailId=:ml") })
public class UserDTO {
	@Id
	@GenericGenerator(name = "m", strategy = "increment")
	@GeneratedValue(generator = "m")
	private Integer id;
	private String name;
	@Column(name = "email")
	private String mailId;
	private Long phoneNumber;

	public UserDTO() {
		System.out.println(" this is DTO " + this.getClass().getSimpleName());

	}

	public UserDTO(Integer id, String name, String mailId, Long phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.mailId = mailId;
		this.phoneNumber = phoneNumber;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", name=" + name + ", mailId=" + mailId + ", phoneNumber=" + phoneNumber + "]";
	}

}
