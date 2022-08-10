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
	public boolean save(PoliticianDto politicianDto) {//1
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
	public PoliticianDto findById(int id) {//2

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
				//politicianDto.setPartyname(PartySysmbol.getPartyName(partysysbmol))
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
	public PoliticianDto findByIdAndPresident(int id, String president) {//3
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
	public PoliticianDto findByIdAndPresidentAndName(int id, String name, String president) {//4
		try(Connection connection=DriverManager.getConnection(URL.getvalue(), USERNAME.getvalue(), SECRATE.getvalue())) {
			//Connection connection=DriverManager.getConnection(URL.getvalue(), USERNAME.getvalue(), SECRATE.getvalue());
			
			String select = "SELECT * from politician.politician_info where id=? AND president=? AND name=? ";
			PreparedStatement preparedStatement=connection.prepareStatement(select);
			//PreparedStatement preparedStatement=connection.prepareStatement(select);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(3, president);
			preparedStatement.setString(2, name);
			
			
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
				
				PoliticianDto politicianDto1=new PoliticianDto();
				politicianDto1.setId(id3);
				politicianDto1.setName(name2);
				politicianDto1.setPartyname(partyname);
				politicianDto1.setPresident(president3);
				politicianDto1.setTotalmembers(totalmember);
				politicianDto1.setBudget(partybudget);
				politicianDto1.setHeadquaters(headquaters);
				politicianDto1.setPartylocation(partylocation);
				politicianDto1.setPartysysmbol(partysysmbol);
				
				
//				List<PoliticianDto> politicianDto1=new ArrayList<PoliticianDto>();
//				politicianDto1.add(politicianDto);
//				for (PoliticianDto politicianDto2 : politicianDto1) {
//					System.out.println("from array list : " +politicianDto2);
//				}
				
				return politicianDto1;
			}
			
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String findNameById(int id) {//6
		try(Connection connection=DriverManager.getConnection(URL.getvalue(), USERNAME.getvalue(), SECRATE.getvalue())) {
			//Connection connection=DriverManager.getConnection(URL.getvalue(), USERNAME.getvalue(), SECRATE.getvalue());
			
			String select = "SELECT * from politician.politician_info where id=?";
			PreparedStatement preparedStatement=connection.prepareStatement(select);
			//PreparedStatement preparedStatement=connection.prepareStatement(select);
			preparedStatement.setInt(1, id);
			
		//	preparedStatement.setString(2, name);
			
			
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				//Integer id4= resultSet.getInt(1);
				String name3= resultSet.getString(2);
//				String partyname= resultSet.getString(3);
//				String president= resultSet.getString(4);
//				Integer totalmember= resultSet.getInt(5);
//				Double partybudget= resultSet.getDouble(6);
//				String headquaters= resultSet.getString(7);
//				String partylocation=resultSet.getString(8);
//				String partysysmbol=resultSet.getString(9);
//				
//				PoliticianDto politicianDto=new PoliticianDto();
//				politicianDto.setId(id4);
//				politicianDto.setName(name3);
//				politicianDto.setPartyname(partyname);
//				politicianDto.setPresident(president);
//				politicianDto.setTotalmembers(totalmember);
//				politicianDto.setBudget(partybudget);
//				politicianDto.setHeadquaters(headquaters);
//				politicianDto.setPartylocation(partylocation);
//				politicianDto.setPartysysmbol(partysysmbol);
				return name3;
			}
		
	}
          catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public PoliticianDto findByIdName( int id,String name) {
		try(Connection connection=DriverManager.getConnection(URL.getvalue(), USERNAME.getvalue(), SECRATE.getvalue())) {
			String select = "SELECT * from politician.politician_info where id=? And name=?";
			PreparedStatement preparedStatement=connection.prepareStatement(select);
			
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			
			
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Integer id5= resultSet.getInt(1);
				String name4= resultSet.getString(2);
				String partyname= resultSet.getString(3);
				String president= resultSet.getString(4);
				Integer totalmember= resultSet.getInt(5);
				Double partybudget= resultSet.getDouble(6);
				String headquaters= resultSet.getString(7);
				String partylocation=resultSet.getString(8);
				String partysysmbol=resultSet.getString(9);
				
				PoliticianDto politicianDto2=new PoliticianDto();
				politicianDto2.setId(id5);
				politicianDto2.setName(name4);
				politicianDto2.setPartyname(partyname);
				politicianDto2.setPresident(president);
				politicianDto2.setTotalmembers(totalmember);
				politicianDto2.setBudget(partybudget);
				politicianDto2.setHeadquaters(headquaters);
				politicianDto2.setPartylocation(partylocation);
				politicianDto2.setPartysysmbol(partysysmbol);
			
				return politicianDto2;
			}
		
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String findPresidentByIdAndName(int id, String name) {//7
		try(Connection connection=DriverManager.getConnection(URL.getvalue(), USERNAME.getvalue(), SECRATE.getvalue())) {
			
			
			String select = "SELECT * from politician.politician_info where id=? AND name=? ";
			PreparedStatement preparedStatement=connection.prepareStatement(select);
			
			preparedStatement.setInt(1, id);
			
			preparedStatement.setString(2, name);
			
			
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				Integer id3= resultSet.getInt(1);
				String name2= resultSet.getString(2);
//				String partyname= resultSet.getString(3);
				String president3= resultSet.getString(4);
//				Integer totalmember= resultSet.getInt(5);
//				Double partybudget= resultSet.getDouble(6);
//				String headquaters= resultSet.getString(7);
//				String partylocation=resultSet.getString(8);
//				String partysysmbol=resultSet.getString(9);
				
				PoliticianDto politicianDto3=new PoliticianDto();
//				politicianDto1.setId(id3);
//				politicianDto1.setName(name2);
//				politicianDto1.setPartyname(partyname);
				politicianDto3.setPresident(president3);
//				politicianDto1.setTotalmembers(totalmember);
//				politicianDto1.setBudget(partybudget);
//				politicianDto1.setHeadquaters(headquaters);
//				politicianDto1.setPartylocation(partylocation);
//				politicianDto1.setPartysysmbol(partysysmbol);
//				
				return president3;
		
			}
			
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return null;
	}

	@Override
	public int getTotal() {
		try(Connection connection=DriverManager.getConnection(URL.getvalue(), USERNAME.getvalue(), SECRATE.getvalue())) {
			String select ="SELECT COUNT(*) as count_politician from politician_info";
			PreparedStatement preparedStatement=connection.prepareStatement(select);
			ResultSet resultSet=preparedStatement.executeQuery();
			
		    resultSet.next();
		    int count=resultSet.getInt(1);
		    PoliticianDto politicianDto8=new PoliticianDto();
		    return count;
				
					
				
			
			
			
			
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}

	@Override
	public PoliticianDto findPartyByMaxMembers() {
		try(Connection connection=DriverManager.getConnection(URL.getvalue(), USERNAME.getvalue(), SECRATE.getvalue())) {
			String select ="SELECT MAX(totalmembers=?) FROM politician_info";
			
					//"SELECT * from politician.politician_info where id=? And name=?";
			PreparedStatement preparedStatement=connection.prepareStatement(select);
			
			int totalmembers = 0;
			preparedStatement.setInt(1, totalmembers);
			
			
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				
				String partyname= resultSet.getString(1);
				
				PoliticianDto politicianDto2=new PoliticianDto();
				
				politicianDto2.setPartyname(partyname);
			
			
				return politicianDto2;
			}
		
			
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	
	
}
	