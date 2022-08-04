package com.xworkz.job.dto;

import com.xworkz.job.costants.Desigination;
import com.xworkz.job.costants.Qualification;
import lombok.*;


public class JobDto {
 private Integer id;
 private Desigination desig;
 private double annualpackage;
 private Qualification qualifi;
 private double percentage;
 //private String fresher;
 
 
 public JobDto(int i, Desigination fullstackDeveloper, double d, Qualification be, double e) {
	 this.id=id;
	 this.desig=desig;
	 this.annualpackage= annualpackage;
	 this.qualifi=qualifi;
	 this.percentage=percentage;
	 
	 
	// TODO Auto-generated constructor stub
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Desigination getDesig() {
	return desig;
}
public void setDesig(Desigination desig) {
	this.desig = desig;
}
public double getAnnualpackage() {
	return annualpackage;
}
public void setAnnualpackage(double annualpackage) {
	this.annualpackage = annualpackage;
}
public Qualification getQualifi() {
	return qualifi;
}
public void setQualifi(Qualification qualifi) {
	this.qualifi = qualifi;
}
public double getPercentage() {
	return percentage;
}
public void setPercentage(double percentage) {
	this.percentage = percentage;
}
//public String isFresher() {
	//return fresher;
//}
//public void setFresher(String fresher) {
	//this.fresher = fresher;
//}

@Override
public String toString() {
	return "JobDto [id=" + id + ", desig=" + desig + ", annualpackage=" + annualpackage + ", qualifi=" + qualifi
			+ ", percentage=" + percentage + "]";//, fresher=" + fresher + "
}
}


