package com.xworkz.job.dao;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import static com.xworkz.job.costants.MysqlProperties.*;


import com.xworkz.job.dto.JobDto;

public class JobDaoImpl implements JobDAo {

	@Override
	public boolean save(JobDto jobDto) {
		try {
			Connection connection=DriverManager.getConnection(URL.getValue(), USERNAME.getValue(), SECRET.getValue());
			String insert ="insert into job.job_info(?,?,?,?,?,?)";
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}

}
