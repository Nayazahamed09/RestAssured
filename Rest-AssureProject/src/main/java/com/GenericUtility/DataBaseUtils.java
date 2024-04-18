package com.GenericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtils  {
	Connection con=null;
	
	/*
	 * This method is used to connect the database
	 */
	
	public void getConnectiontoDatabase() throws Throwable
	{
		//Register the driver
		
		Driver DBdriver=new Driver();
		DriverManager.registerDriver(DBdriver);
		//Get connection For Database
		
		con=DriverManager.getConnection(IpathConstants.DBURL, IpathConstants.DBUsername, IpathConstants.DBpassword);
		
	}
	
	/*
	 * this method is used to create the statement for query
	 */
	
	public String createStatementforDatabaseandgetData(String Query,int coloumnindex, String Expecteddata) throws Throwable
	{
		//Create the statement
		
		String Data=null;
		boolean flag=false;
		ResultSet Result=con.createStatement().executeQuery(Query);
		while(Result.next())
		{
			Data=Result.getString(coloumnindex);
			if(Data.equalsIgnoreCase(Expecteddata))
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println(Data+"--------->data verified");
			return Expecteddata;
		}
		else
		{
			System.out.println("data is not verified");
			return "";
					
		}
		
		
		/*
		 * this method is used to close the db
		 */
		
	
	}
	public void closeDB() throws Throwable {
		con.close();
	}

}