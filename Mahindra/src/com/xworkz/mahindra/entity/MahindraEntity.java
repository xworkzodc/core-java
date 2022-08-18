package com.xworkz.mahindra.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@Table(name= "mahindra_info")
@NoArgsConstructor
public class MahindraEntity {
	@Id
	@Column(name="id")
	private Integer id;
	@Column(name="carName")
	private String carName;
	@Column(name="location")
	private String location ;
	@Column(name="checkInTime")
	private String checkInTime;
	//private LocalTime checkInTime;
	@Column(name="checkOutTime")
	private String checkOutTime;
	//private LocalTime checkOut;
	@Column(name="createBy")
	private String createBy;
	@Column(name="createDate")
	private	String createDate;//localdate
	@Column(name="updateDate")
	private String updateDate;//localdate
	@Column(name="owner")
	private String owner;
	@Column(name="pricePerDay")
	private String pricePerDay ;
}
