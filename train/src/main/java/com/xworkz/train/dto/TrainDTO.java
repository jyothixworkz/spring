package com.xworkz.train.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@ToString
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name ="train_details")
public class TrainDTO  implements Serializable{
	
	
	public TrainDTO() {
		System.out.println(" Train DTO is created "+ this.getClass().getSimpleName());
		// TODO Auto-generated constructor stub
	}
	@Id
	@GenericGenerator(name = "man", strategy = "increment")
	@GeneratedValue(generator = "man")
	private Integer id;
	private String trainName;

	
	
	
	

}
