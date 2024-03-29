package com.xworkz.kalyan.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="student_info")
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private	Integer id;
private String name;
private String address;

}
