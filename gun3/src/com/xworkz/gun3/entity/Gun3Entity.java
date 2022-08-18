package com.xworkz.gun3.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//import com.xworkz.gun2.entity.Gun2Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@Entity
@Table(name="gun3_info")
@NoArgsConstructor

public class Gun3Entity implements Serializable {
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
	@Column(name="gunColor")
	String gunColor;
}
