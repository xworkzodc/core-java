package com.xworkz.freedomFighters.entity;

import java.time.LocalDate;

import javax.persistence.MappedSuperclass;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass



public class ParentEntity {
private String createdBy;
private LocalDate crateDate;
private String updatedBy;
private LocalDate updatedDate;

public ParentEntity(String createdBy, LocalDate crateDate, String updatedBy, LocalDate updatedDate) {
	//super();
	this.createdBy = createdBy;
	this.crateDate = crateDate;
	this.updatedBy = updatedBy;
	this.updatedDate = updatedDate;
}



}