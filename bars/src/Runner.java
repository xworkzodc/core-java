import com.xworkz.bars.constant.Bartype;
import com.xworkz.bars.dao.BarDao;
import com.xworkz.bars.dao.BarDaoImpl;
import com.xworkz.bars.dto.BarDto;

public class Runner {

	public static void main(String[] args) {
	
		BarDto bardto=new BarDto(6, "fycu" , "yu", Bartype.WINESTORE,5000.00 , 50000.00 );
		BarDao bardao=new BarDaoImpl();
		bardao.save(bardto);
	}
}
