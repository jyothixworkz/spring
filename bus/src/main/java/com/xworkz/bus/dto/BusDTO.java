package com.xworkz.bus.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor

@Data
@Setter
@Getter
@ToString
@Entity
@Table(name="bus_details")
public class BusDTO implements Serializable {
	@Id
	@GenericGenerator(name = "nan",strategy = "increment")
	@GeneratedValue(generator = "nan")
	private Integer id;
	private String busName;
	private String ownerName;
	private String driverName;
	private String collectorName;
	private Integer noOfSeats;

	public BusDTO() {
		System.out.println("BusDTO is created :" + this.getClass().getSimpleName());
	}

}
