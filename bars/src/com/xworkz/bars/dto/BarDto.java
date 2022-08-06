package com.xworkz.bars.dto;

import java.io.Serializable;

import com.xworkz.bars.constant.Bartype;

//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;


public class BarDto implements Serializable{
private Integer id;
private String name;
private String location;
private Bartype type=Bartype.DEFAULT;
private Double avgCollectionPerDay;
private Double collectionPerMonth;

public BarDto(int id, String string, String string2, Bartype resort, double d, double e) {
	this.id =id;
	this.name=name;
	this.location=location;
	this.type=type;
	this.avgCollectionPerDay=avgCollectionPerDay;
	this.collectionPerMonth=collectionPerMonth;
	// TODO Auto-generated constructor stub
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
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public Bartype getType() {
return type;
}
public void setType(Bartype type) {
	this.type = type;
}
public Double getAvgCollectionPerDay() {
	return avgCollectionPerDay;
}
public void setAvgCollectionPerDay(Double avgCollectionPerDay) {
	this.avgCollectionPerDay = avgCollectionPerDay;
}
public Double getCollectionPerMonth() {
	return collectionPerMonth;
}
public void setCollectionPerMonth(Double collectionPerMonth) {
	this.collectionPerMonth = collectionPerMonth;
}
@Override
public String toString() {
	return "BarDto [id=" + id + ", name=" + name + ", location=" + location + ", type=" + type
			+ ", avgCollectionPerDay=" + avgCollectionPerDay + ", collectionPerMonth=" + collectionPerMonth + "]";
}




}
