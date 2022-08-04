package com.xworkz.job.dao;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import static com.xworkz.job.costants.MysqlProperties.*;


import com.xworkz.job.dto.JobDto;

public class JobDaoImpl implements JobDAo {

	@Override
	public boolean save(JobDto jobDto) {
		try {
			Connection connection=DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
			String insert ="insert into job.job_info values(?,?,?,?,?,?)";
			PreparedStatement sql= connection.prepareStatement(insert);
			sql.setInt(1, jobDto.getId());
			sql.setString(2, jobDto.getDesig().getDesign());
			sql.setDouble(3, jobDto.getAnnualpackage());
			sql.setString(4, jobDto.getQualifi().getQualifi());
			sql.setDouble(5, jobDto.getPercentage());
			//sql.setString(6, jobDto.g);
			int noOfRowesAffected= sql.executeUpdate();
			if(noOfRowesAffected>0) {
				System.out.println(insert);
				
			}
			else {
				System.out.println("unable to insert");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}

}
