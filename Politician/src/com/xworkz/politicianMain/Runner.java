package com.xworkz.politicianMain;

import com.xworkz.politician.constants.PartySysmbol;
import com.xworkz.politician.constants.Partyname;
import com.xworkz.politician.dao.PoliticianDao;
import com.xworkz.politician.dao.PoliticianDaoImpl;
import com.xworkz.politician.dto.PoliticianDto;

public class Runner {

	public static void main(String[] args) {
		// PoliticianDto(1, "kalyan", Partyname.AAP, "Darshan", 30, 1200000.00,
		// "banglore", "Delhi", PartySysmbol.AAP);

		PoliticianDto politicianDto = new PoliticianDto(1, "kalyan", Partyname.AAP.toString(), "Darshan", 30, 12000.00,
				"banglore", "Delhi", PartySysmbol.AAP.toString());
		PoliticianDto politicianDto1 = new PoliticianDto(2, "Darshan", Partyname.AAP.toString(), "Hanumant", 46,
				42000.00, "banglore", "Delhi", PartySysmbol.APNADAL.toString());

		PoliticianDto politicianDto2 = new PoliticianDto(3, "Manoj", Partyname.BJP.toString(), "Raghuvendra", 46,
				42000.00, "banglore", "Gujrat", PartySysmbol.APNADAL.toString());

		PoliticianDto politicianDto3 = new PoliticianDto(4, "Manoj", Partyname.BJP.toString(), "Raghu", 46, 42000.00,
				"banglore", "Gujrat", PartySysmbol.APNADAL.toString());
		PoliticianDto politicianDto4 = new PoliticianDto(5, "Manoj", Partyname.BJP.toString(), "Nandan", 46, 42000.00,
				"banglore", "Gujrat", PartySysmbol.APNADAL.toString());
		PoliticianDto politicianDto5 = new PoliticianDto(6, "Manoj", Partyname.BJP.toString(), "sharath", 46, 42000.00,
				"banglore", "Gujrat", PartySysmbol.APNADAL.toString());
		PoliticianDto politicianDto6 = new PoliticianDto(7, "Manoj", Partyname.BJP.toString(), "Manohar", 46, 42000.00,
				"banglore", "Gujrat", PartySysmbol.APNADAL.toString());
		PoliticianDto politicianDto7 = new PoliticianDto(8, "Manoj", Partyname.BJP.toString(), "bhomika", 46, 42000.00,
				"banglore", "Gujrat", PartySysmbol.APNADAL.toString());
		PoliticianDto politicianDto8 = new PoliticianDto(9, "Manoj", Partyname.BJP.toString(), "Raghuvendra", 46,
				42000.00, "banglore", "Gujrat", PartySysmbol.APNADAL.toString());
		PoliticianDto politicianDto9 = new PoliticianDto(10, "Manoj", Partyname.BJP.toString(), "Raghuvendra", 46,
				42000.00, "banglore", "Gujrat", PartySysmbol.APNADAL.toString());
		PoliticianDto politicianDto10 = new PoliticianDto(11, "Manoj", Partyname.BJP.toString(), "Raghuvendra", 46,
				42000.00, "banglore", "Gujrat", PartySysmbol.APNADAL.toString());

		PoliticianDao politicianDao = new PoliticianDaoImpl();
//		politicianDao.save(politicianDto);
//		politicianDao.save(politicianDto1);
//		politicianDao.save(politicianDto2);
//		politicianDao.save(politicianDto3);
//		politicianDao.save(politicianDto4);
//		politicianDao.save(politicianDto5);
//		politicianDao.save(politicianDto6);
//		politicianDao.save(politicianDto7);
//		politicianDao.save(politicianDto8);
		// politicianDao.save(politicianDto9);
		// boolean save = politicianDao.save(politicianDto10);
		// System.out.println(save);
	
          // 2nd-----
//		System.out.println("=================");
//		PoliticianDto dtos = politicianDao.findById(1);
//
//		System.out.println(dtos);
		 //3rd-----
		PoliticianDto dtos2=politicianDao.findByIdAndPresident(5,"Nandan");
		System.out.println("value : " +dtos2);
		
		//4rth
		PoliticianDto dtos3=politicianDao.findByIdAndPresidentAndName(2, "Hanumant", "Darshan");
		System.out.println("method 4rth : " +dtos3);
		
		//5th
		
		String dtos4=politicianDao.findNameById(2, "Darshan");
		System.out.println("method 5rth : " +dtos4);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
