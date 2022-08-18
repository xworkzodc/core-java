package com.xworkz.CartoonCharacter.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="cartooncharacter_info")
@NamedQueries({ @NamedQuery (name= "findByName",query= "Select cart from Cartoon cart where cart.name=:nm"),
	            @NamedQuery (name="total",query="select count(*) from Cartoon"),
	            @NamedQuery (name="findByNameAndCountryAndGenderAndAuthor",query="Select cart from Cartoon cart where cart.name=:nm"),
	            @NamedQuery (name="findAuthorByName",query="Select cart.author from Cartoon cart where cart.name=:nm")
	            })
              
//cart.gender=:nm2,cart.author=:nm3,,cart.counrty=:nm1

public class Cartoon extends CartoonParent {
	@GenericGenerator(name="arjun", strategy = "increment")
	@GeneratedValue(generator = "arjun")
	@Id
	private Integer cid;
	private String name;
	private String country;
	private String gender;
	private String author;
	private String type;
	
	public Cartoon( String name, String country, String gender, String author, String type, String createdBy, LocalDate createdDate, String updatedBy, LocalDate updatedDate) {
		super(createdBy, createdDate, updatedBy, updatedDate);
		
		//this.cid = cid;
		this.name = name;
		this.country = country;
		this.gender = gender;
		this.author = author;
		this.type = type;
	}
	
	
}
