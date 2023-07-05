package com.jsp.hospital.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Address {
	@Id
	private int id;
	private String city;
	private String state;
	private String country;
	private long pincode;


}
