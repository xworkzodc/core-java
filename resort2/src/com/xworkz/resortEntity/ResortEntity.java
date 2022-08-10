package com.xworkz.resortEntity;

import java.time.LocalDate;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
@Entity
@Table(name="resort_info")

public class ResortEntity implements Serializable{
	@Column(name="id")
	private Integer id;
	@Column(name="name")
	private String name;
	@Column(name="location")
	private String location ;
	@Column(name="checkInTime")
	private LocalTime checkInTime;
	@Column(name="checkOut")
	private LocalTime checkOut;
	@Column(name="createBy")
	private String createBy;
	@Column(name="createDate")
	private	LocalDate createDate;
	@Column(name="updateDate")
	private LocalDate updateDate;
	@Column(name="owner")
	private String owner;
	@Column(name="pricePerDay")
	private double pricePerDay ;
	
	

}
