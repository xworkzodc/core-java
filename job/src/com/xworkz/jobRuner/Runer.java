package com.xworkz.jobRuner;

import com.xworkz.job.costants.Desigination;
import com.xworkz.job.costants.Qualification;
import com.xworkz.job.dao.JobDAo;
import com.xworkz.job.dao.JobDaoImpl;
import com.xworkz.job.dto.JobDto;

public class Runer {

	public static void main(String[] args) {
		JobDto jobDto=new JobDto(1,Desigination.FULLSTACK_DEVELOPER,35000.00D,Qualification.BE, 75.5d);
		JobDAo jobDao=new JobDaoImpl ();
		//JobDaoImpl  hjk =  (JobDaoImpl)jobDao; Downcasting (converting parent object to child)
		jobDao.save(jobDto);
	}

}
