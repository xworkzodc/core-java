package com.xworkz.basic_java.collectionExample.bike_a_dao;

import com.xworkz.basic_java.collectionExample.bike_a_dao.dto.BikeDTO;
import com.xworkz.basic_java.collectionExample.bike_a_dao.service.BikeServices;
import com.xworkz.basic_java.collectionExample.bike_a_dao.service.BikeServicesImpl;



	public class ArrayListApplication {

		public static void main(String[] args) {

			BikeDTO hornett = new BikeDTO();
			hornett.setModelNo(15685);
			hornett.setCompanyName("Honda");
			hornett.setCubicCapacity("180cc");
			hornett.setColor("Matt-Orange");
			hornett.setPrice(180000.00);
			hornett.setTopSpeed(153);

			BikeDTO apache = new BikeDTO();
			apache.setModelNo(15675);
			apache.setCompanyName("TVS");
			apache.setCubicCapacity("160cc");
			apache.setColor("Blue");
			apache.setPrice(14700.00);
			apache.setTopSpeed(140);

			BikeDTO extreme = new BikeDTO();
			extreme.setModelNo(15677);
			extreme.setCompanyName("Hero");
			extreme.setCubicCapacity("160cc");
			extreme.setColor("White-Red");
			extreme.setPrice(144000);
			extreme.setTopSpeed(125);

			BikeDTO fZ = new BikeDTO();
			fZ.setModelNo(156525);
			fZ.setCompanyName("Yamaha");
			fZ.setCubicCapacity("149cc");
			fZ.setColor("Blue");
			fZ.setPrice(141000.00);
			fZ.setTopSpeed(125);

			BikeDTO gixxer = new BikeDTO();
			gixxer.setModelNo(156775);
			gixxer.setCompanyName("Suzuki");
			gixxer.setCubicCapacity("155cc");
			gixxer.setColor("Black");
			gixxer.setPrice(169000.00);
			gixxer.setTopSpeed(134);

			BikeServices service = new BikeServicesImpl();
			service.addBike(hornett);
			service.addBike(apache);
			service.addBike(extreme);
			service.addBike(fZ);
			service.addBike(gixxer);

			System.out.println("");

			service.getBike("Yamaha");

			System.out.println("");

			gixxer.setCompanyName("Suzuki-GixxerSF");
			service.updateBike(gixxer);

			System.out.println("");

			service.deleteBike(fZ);
		}
	}
