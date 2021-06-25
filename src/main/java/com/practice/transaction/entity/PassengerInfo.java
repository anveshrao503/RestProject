package com.practice.transaction.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="PASSENGER_INFO")
public class PassengerInfo {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String email;
	private String source;
	private String destination;
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "mm-dd-yyyy")
	private Date dob;
	private double fare;

}
