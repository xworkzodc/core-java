package com.xworkz.gun.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@ToString
@Data
@AllArgsConstructor
@Entity
@Table(name="gun_info")
@NoArgsConstructor
public class GunEntity implements Serializable {
	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name="gunName")
	private String gunName;
	@Column(name="gunPrice")
	private Integer gunPrice;
	@Column(name="gunOnwer")
	private String gunOnwer;
	@Column(name="gunCompany")
	private String gunCompany;
	//@Column(name="gunColor")
	//String gunColor;

}
