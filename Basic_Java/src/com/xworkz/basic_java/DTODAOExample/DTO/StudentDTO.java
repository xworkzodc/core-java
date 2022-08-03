package com.xworkz.basic_java.DTODAOExample.DTO;

public class StudentDTO {
  private String id;
  private String name;
  private String batchName;
  private long phoneNo;
  private String percentage;


 
public StudentDTO (String id ,String name ,String batchName,long phoneNo,String percentage ) {
this.id=id;
this.name=name;	
this. batchName= batchName;	
this.phoneNo=phoneNo;	
this.percentage=percentage;	
	
}
public void setid(String id) {
	this.id=id;
}

public void setname(String name) {
	this.name=name;	
}
public void setbatchName(String batchName) {
	this.batchName=batchName;	
}
public void setpercentage(String percentage) {
	this.percentage=percentage;	
}
public void setphoneNo(long phoneNo) {
	this.phoneNo=phoneNo;	
}
public String getid() {
	return id;
}
public String getname() {
	return name;
}
public String getbatchName() {
	return batchName;
}
public long getphoneNo() {
	return phoneNo;
}
public String toString() {
	return "StudentDTO [id=" +id+ " ,name =  "+ name+ ", batchName= "+batchName+ ",phoneNo="+ phoneNo+" , percentage="+ percentage+" ]";
}
}