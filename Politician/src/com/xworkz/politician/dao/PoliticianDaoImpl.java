package com.xworkz.politician.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.xworkz.politician.constants.Partyname;
import com.xworkz.politician.dto.PoliticianDto;
import static com.xworkz.politician.constants.MysqlProperties.*;

public class PoliticianDaoImpl implements PoliticianDao {

	private static final String SECERET = null;

	@Override
	public boolean save(PoliticianDto politicianDto) {
		try (Connection connection = DriverManager.getConnection(URL.getvalue(), USERNAME.getvalue(),
				SECRATE.getvalue());) {

			// Before this program we are using this type method======Connection connection
			// =DriverManager.getConnection(URL.getvalue(), USERNAME.getvalue(),
			// SECRATE.getvalue());

			String insert = "INSERT into Politician.Politician_info values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(insert);
			preparedStatement.setInt(1, politicianDto.getId());
			preparedStatement.setString(2, politicianDto.getName());
			preparedStatement.setString(3, politicianDto.getPartyname());
			preparedStatement.setString(4, politicianDto.getPresident());
			preparedStatement.setInt(5, politicianDto.getTotalmembers());
			preparedStatement.setDouble(6, politicianDto.getBudget());
			preparedStatement.setString(7, politicianDto.getHeadquaters());
			preparedStatement.setString(8, politicianDto.getPartylocation());
			preparedStatement.setString(9, politicianDto.getPartysysmbol());
			int noOf = preparedStatement.executeUpdate();
			if (noOf > 0) {
				System.out.println("the value are inserted" + insert);
			} else {
				System.out.println("value are not inserted");
			}

			return noOf == 1 ? true : false;
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return false;
	}

	@Override
	public PoliticianDto findById(int id) {

		try (Connection connection = DriverManager.getConnection(URL.getvalue(), USERNAME.getvalue(),
				SECRATE.getvalue())) {
			// Connection connection =DriverManager.getConnection(URL.getvalue(),
			// USERNAME.getvalue(), SECRATE.getvalue());
			String select = "SELECT * From politician_info where id= ?";
			PreparedStatement preparedStatement = connection.prepareStatement(select);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			// System.out.println(resultSet);
			while (resultSet.next()) {
				Integer id1 = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String partyname = resultSet.getString(3);
				String president = resultSet.getString(4);
				System.out.println(president);
				Integer totalmember = resultSet.getInt(5);

				double partybudget = resultSet.getDouble(6);
				String headquaters = resultSet.getString(7);
				String partylocation = resultSet.getString(8);
				String partysysbmol = resultSet.getString(9);

				PoliticianDto politicianDto = new PoliticianDto();  // here created dto instnce and using reference we are storing the db values back

				politicianDto.setId(id1);
				politicianDto.setName(name);
				
				politicianDto.setPartyname(partyname);
				//politicianDto.setPartyname(Partyname.getPartyName(partyname).getparty())
				politicianDto.setPresident(president);
				politicianDto.setTotalmembers(totalmember);
				politicianDto.setBudget(partybudget);
				politicianDto.setHeadquaters(headquaters);
				politicianDto.setPartylocation(partylocation);
				politicianDto.setPartysysmbol(partysysbmol);
				return politicianDto;

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return null;
	}

	@Override
	public PoliticianDto findByIdAndPresident(int id, String president) {
		try (Connection connection=DriverManager.getConnection(URL.getvalue(), USERNAME.getvalue(), SECRATE.getvalue())){
			//Connection connection=DriverManager.getConnection(URL.getvalue(), USERNAME.getvalue(), SECRATE.getvalue());
			
			
			String select = "SELECT * from politician.politician_info where id=? AND president=? ";
			PreparedStatement preparedStatement=connection.prepareStatement(select);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, president);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Integer id2= resultSet.getInt(1);
				String name= resultSet.getString(2);
				String partyname= resultSet.getString(3);
				String president2= resultSet.getString(4);
				Integer totalmember= resultSet.getInt(5);
				Double partybudget= resultSet.getDouble(6);
				String headquaters= resultSet.getString(7);
				String partylocation=resultSet.getString(8);
				String partysysmbol=resultSet.getString(9);
				
				PoliticianDto politicianDto=new PoliticianDto();
				politicianDto.setId(id2);
				politicianDto.setName(name);
				politicianDto.setPartyname(partyname);
				politicianDto.setPresident(president2);
				politicianDto.setTotalmembers(totalmember);
				politicianDto.setBudget(partybudget);
				politicianDto.setHeadquaters(headquaters);
				politicianDto.setPartylocation(partylocation);
				politicianDto.setPartysysmbol(partysysmbol);
				
				
//				List<PoliticianDto> politicianDto1=new ArrayList<PoliticianDto>();
//				politicianDto1.add(politicianDto);
//				for (PoliticianDto politicianDto2 : politicianDto1) {
//					System.out.println("from array list : " +politicianDto2);
//				}
				
				return politicianDto;
			}
			
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public PoliticianDto findByIdAndPresidentAndName(int id, String name, String president) {
		try(Connection connection=DriverManager.getConnection(URL.getvalue(), USERNAME.getvalue(), SECRATE.getvalue())) {
			//Connection connection=DriverManager.getConnection(URL.getvalue(), USERNAME.getvalue(), SECRATE.getvalue());
			
			String select = "SELECT * from politician.politician_info where id=? AND president=? AND name=? ";
			PreparedStatement preparedStatement=connection.prepareStatement(select);
			//PreparedStatement preparedStatement=connection.prepareStatement(select);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, president);
			preparedStatement.setString(3, name);
			
			
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Integer id3= resultSet.getInt(1);
				String name2= resultSet.getString(2);
				String partyname= resultSet.getString(3);
				String president3= resultSet.getString(4);
				Integer totalmember= resultSet.getInt(5);
				Double partybudget= resultSet.getDouble(6);
				String headquaters= resultSet.getString(7);
				String partylocation=resultSet.getString(8);
				String partysysmbol=resultSet.getString(9);
				
				PoliticianDto politicianDto=new PoliticianDto();
				politicianDto.setId(id3);
				politicianDto.setName(name2);
				politicianDto.setPartyname(partyname);
				politicianDto.setPresident(president3);
				politicianDto.setTotalmembers(totalmember);
				politicianDto.setBudget(partybudget);
				politicianDto.setHeadquaters(headquaters);
				politicianDto.setPartylocation(partylocation);
				politicianDto.setPartysysmbol(partysysmbol);
				
				
//				List<PoliticianDto> politicianDto1=new ArrayList<PoliticianDto>();
//				politicianDto1.add(politicianDto);
//				for (PoliticianDto politicianDto2 : politicianDto1) {
//					System.out.println("from array list : " +politicianDto2);
//				}
				
				return politicianDto;
			}
			
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String findNameById(int id, String name) {
		try(Connection connection=DriverManager.getConnection(URL.getvalue(), USERNAME.getvalue(), SECRATE.getvalue())) {
			//Connection connection=DriverManager.getConnection(URL.getvalue(), USERNAME.getvalue(), SECRATE.getvalue());
			
			String select = "SELECT * from politician.politician_info where id=? AND name=? ";
			PreparedStatement preparedStatement=connection.prepareStatement(select);
			//PreparedStatement preparedStatement=connection.prepareStatement(select);
			preparedStatement.setInt(1, id);
			
			preparedStatement.setString(2, name);
			
			
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Integer id4= resultSet.getInt(1);
				String name3= resultSet.getString(2);
				String partyname= resultSet.getString(3);
				String president= resultSet.getString(4);
				Integer totalmember= resultSet.getInt(5);
				Double partybudget= resultSet.getDouble(6);
				String headquaters= resultSet.getString(7);
				String partylocation=resultSet.getString(8);
				String partysysmbol=resultSet.getString(9);
				
				PoliticianDto politicianDto=new PoliticianDto();
				politicianDto.setId(id4);
				politicianDto.setName(name3);
				politicianDto.setPartyname(partyname);
				politicianDto.setPresident(president);
				politicianDto.setTotalmembers(totalmember);
				politicianDto.setBudget(partybudget);
				politicianDto.setHeadquaters(headquaters);
				politicianDto.setPartylocation(partylocation);
				politicianDto.setPartysysmbol(partysysmbol);
				return null;
			}
		
	}
          catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;

}

	@Override
	public PoliticianDto findByIdName(String name, int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
