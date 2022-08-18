package com.xworkz.CartoonCharacter.runner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.CartoonCharacter.dao.CartoonDao;
import com.xworkz.CartoonCharacter.dao.CartoonDaoImpl;
import com.xworkz.CartoonCharacter.entity.Cartoon;



public class CartoonRunner {
public static void main(String [] args) {
	Cartoon cartoon=new Cartoon( "Chhota bheem","india","male","ravi","Cartoon"
			                   ,"Darshan",LocalDate.now(),"Ramesh",LocalDate.now());
	Cartoon cartoon1=new Cartoon( " tom","nepal","male","malthish","Cartoon"
            ,"kalyan",LocalDate.now(),"abhishek",LocalDate.now());
	Cartoon cartoon2=new Cartoon( "jerry","china","male","ritesh","Cartoon"
            ,"Darshan",LocalDate.now(),"Ram",LocalDate.now());
	Cartoon cartoon3=new Cartoon( "nanadan","india","male","jaishingh","Cartoon"
            ,"Darshan",LocalDate.now(),"Ramesh",LocalDate.now());
	Cartoon cartoon4=new Cartoon( "Chhota bheem","india","male","Hanuman","Cartoon"
            ,"Darshan",LocalDate.now(),"Ramesh",LocalDate.now());
	Cartoon cartoon5=new Cartoon( "Chhota bheem","india","male","Hanuman","Cartoon"
            ,"Darshan",LocalDate.now(),"Ramesh",LocalDate.now());
	Cartoon cartoon6=new Cartoon( "Chhota bheem","india","male","Hanuman","Cartoon"
            ,"Darshan",LocalDate.now(),"Ramesh",LocalDate.now());
	Cartoon cartoon7=new Cartoon( "Chhota bheem","india","male","Hanuman","Cartoon"
            ,"Darshan",LocalDate.now(),"Ramesh",LocalDate.now());
	Cartoon cartoon8=new Cartoon( "Chhota bheem","india","male","Hanuman","Cartoon"
            ,"Darshan",LocalDate.now(),"Ramesh",LocalDate.now());
	Cartoon cartoon9=new Cartoon( "Chhota bheem","india","male","Hanuman","Cartoon"
            ,"Darshan",LocalDate.now(),"Ramesh",LocalDate.now());
	Cartoon cartoon10=new Cartoon( "Chhota bheem","india","male","raghu","Cartoon"
            ,"Darshan",LocalDate.now(),"Ramesh",LocalDate.now());
	
CartoonDao cartoonDao=new CartoonDaoImpl();//up
List<Cartoon> cartoons=new ArrayList();
cartoons.add(cartoon);
cartoons.add(cartoon1);
cartoons.add(cartoon2);
cartoons.add(cartoon3);
cartoons.add(cartoon4);
cartoons.add(cartoon5);
cartoons.add(cartoon6);
cartoons.add(cartoon7);
cartoons.add(cartoon8);
cartoons.add(cartoon9);
cartoons.add(cartoon10);
//boolean save=cartoonDao.saveAll(cartoons);
//System.out.println(save);
//Cartoon res=cartoonDao.findByName("nanadan");
//	System.out.println(res);

//Integer res=cartoonDao.total();
//System.out.println(res);

//Cartoon res=cartoonDao.findByNameAndCountryAndGenderAndAuthor(" tom", "nepal", "male", "malthish");//5 Cartoon is return type.
//System.out.println(res);

String res=cartoonDao.findAuthorByName("jerry");
 System.out.println(res);
}
}
