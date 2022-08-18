package com.xworkz.marutiSuzuki.entity;

import java.io.Serializable;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@Entity
@Table(name="marutisuzuki_info")
@NoArgsConstructor





public class MarutiSuzukiEntity implements Serializable {
	
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
	@Column(name="checkOut")
	private String checkOut;
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
