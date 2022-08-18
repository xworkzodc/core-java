import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.resort.dao.ResortDao;
import com.xworkz.resort.dao.ResortDaoImpl;
import com.xworkz.resort.entity.ResortEntity;

public class RunnerResort {

	public static void main(String[] args) {
		
		
		ResortEntity resortEntity=new ResortEntity();
		resortEntity.setId(2);
		resortEntity.setName("Mango");
		resortEntity.setLocation("btm");
		resortEntity.setCheckInTime(LocalTime.of(12, 00));
		resortEntity.setCheckOut(LocalTime.of(11, 00));
		resortEntity.setCreateBy("Arjun");
		resortEntity.setCreateDate(LocalDate.now());
		resortEntity.setUpdateDate(LocalDate.now());
		resortEntity.setOwner("omkar sir");
		resortEntity.setPricePerDay(30000D);
		
		ResortDao resortDao=new ResortDaoImpl(); 
		Boolean result=resortDao.save(resortEntity);
		System.out.println("Saved Detials are: "+result);
	}

}
