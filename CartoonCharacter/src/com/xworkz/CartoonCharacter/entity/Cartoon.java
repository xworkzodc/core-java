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
import lombok.ToString;

@Getter
@Setter
@Data
@ToString(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cartooncharacter_info")
@NamedQueries({ @NamedQuery(name = "findByName", query = "Select cart from Cartoon cart where cart.name=:nm"),
		@NamedQuery(name = "total", query = "select count(*) from Cartoon"),
		@NamedQuery(name = "findByNameAndCountryAndGenderAndAuthor", query = "Select cart from Cartoon cart where cart.name=:nm"),
		@NamedQuery(name = "findAuthorByName", query = "Select cart.author from Cartoon cart where cart.name=:nm"),

		@NamedQuery(name = "findAll", query = "Select cart from Cartoon cart"),
		@NamedQuery(name = "findAllByAuthor", query = "Select cart from Cartoon cart where cart.author=:an"),
		@NamedQuery(name = "findAllByAuthorAndGender", query = "Select cart from Cartoon cart where cart.author=:an and cart.gender=:am"),
		@NamedQuery(name = "findAllName", query = "Select cart.name from Cartoon cart "),
		@NamedQuery(name = "findAllCountryName" , query = "Select cart.country from Cartoon cart"),
		@NamedQuery(name = "findAllNameAndCountry",query = "Select cart.name,country from Cartoon cart"),
		@NamedQuery(name = "findAllNameAndCountryAndAuthor",query = "Select cart.name,country,author from Cartoon cart "),
		
		
		//old
		@NamedQuery(name = "findCreatedDateByAuthor", query = "Select cart.createdDate from Cartoon cart where cart.author=:an"),
		@NamedQuery(name="updateAuthorByName",query = "UPDATE Cartoon cart SET cart.author=:nm WHERE cart.name=:am"),
		@NamedQuery(name="updateTypeByName",query="UPDATE Cartoon cart SET cart.type=:tp WHERE cart.name=:nm"),//10,
		@NamedQuery(name = "deleteByName", query="DELETE FROM Customers WHERE CustomerName='Alfreds Futterkiste'")
})

//cart.gender=:nm2,cart.author=:nm3,,cart.counrty=:nm1

public class Cartoon extends CartoonParent {
	@GenericGenerator(name = "arjun", strategy = "increment")
	@GeneratedValue(generator = "arjun")
	@Id
	private Integer cid;
	private String name;
	private String country;
	private String gender;
	private String author;
	private String type;

	public Cartoon(String name, String country, String gender, String author, String type, String createdBy,
			LocalDate createdDate, String updatedBy, LocalDate updatedDate) {
		super(createdBy, createdDate, updatedBy, updatedDate);

		// this.cid = cid;
		this.name = name;
		this.country = country;
		this.gender = gender;
		this.author = author;
		this.type = type;
	}

}
