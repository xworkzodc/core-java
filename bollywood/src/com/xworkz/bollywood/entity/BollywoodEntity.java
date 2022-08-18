package com.xworkz.bollywood.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

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
@NoArgsConstructor
@Table(name="bollywood_info")


public class BollywoodEntity implements Serializable {
	
	@Id
	@Column(name="id")
	private Integer id;
	@Column(name="actorName")
	private String actorName;
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
	@Column(name="driector")
	private String driector;
	@Column(name="pricePerDay")
	private String pricePerDay ;

}
