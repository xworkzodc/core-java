package com.xworkz.politician.dto;

import java.io.Serializable;

import com.xworkz.politician.constants.PartySysmbol;
import com.xworkz.politician.constants.Partyname;

import lombok.Getter;
import lombok.Setter;

//import lombok.*;

@Getter
@Setter
public class PoliticianDto implements Serializable {
	
       private Integer id;
       private String name;
       private String partyname;
       private String president;
       private Integer totalmembers;
       private double  budget; 
       private String headquaters;
       private String partylocation;
       private String partysysmbol;
       
       
       
	
	public PoliticianDto(Integer id, String name, String partyname, String president, Integer totalmembers,
			double budget, String headquaters, String partylocation, String partysysmbol) {
		super();
		this.id = id;
		this.name = name;
		this.partyname = partyname;
		this.president = president;
		this.totalmembers = totalmembers;
		this.budget = budget;
		this.headquaters = headquaters;
		this.partylocation = partylocation;
		this.partysysmbol = partysysmbol;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPartyname() {
		return partyname;
	}
	public void setPartyname(String partyname) {
		this.partyname = partyname;
	}
	public String getPresident() {
		return president;
	}
	public void setPresident(String president) {
		this.president = president;
	}
	public Integer getTotalmembers() {
		return totalmembers;
	}
	public void setTotalmembers(Integer totalmembers) {
		this.totalmembers = totalmembers;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	public String getHeadquaters() {
		return headquaters;
	}
	public void setHeadquaters(String headquaters) {
		this.headquaters = headquaters;
	}
	public String getPartylocation() {
		return partylocation;
	}
	public void setPartylocation(String partylocation) {
		this.partylocation = partylocation;
	}
	public String getPartysysmbol() {
		return partysysmbol;
	}
	public void setPartysysmbol(String partysysmbol) {
		this.partysysmbol = partysysmbol;
	}
	@Override
	public String toString() {
		return "PoliticianDto [id=" + id + ", name=" + name + ", partyname=" + partyname + ", president=" + president
				+ ", totalmembers=" + totalmembers + ", budget=" + budget + ", headquaters=" + headquaters
				+ ", partylocation=" + partylocation + ", partysysmbol=" + partysysmbol + "]";
	}
	
	
}
