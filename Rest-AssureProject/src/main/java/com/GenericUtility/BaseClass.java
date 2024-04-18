package com.GenericUtility;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class BaseClass {
	
	public DataBaseUtils db= new DataBaseUtils();
	
	public javaUtils jlib= new javaUtils();
	
	public RestAssureLibrary RA= new RestAssureLibrary();
	
	public RequestSpecification reqst;
	
	public ResponseSpecification resp;
	
	@BeforeSuite
	public void bsConfig() throws Throwable
	{
		db.getConnectiontoDatabase();
		reqst=new RequestSpecBuilder().setBaseUri("http://rmgtestingserver:8084").setContentType(ContentType.JSON).build();
		resp= new ResponseSpecBuilder().expectContentType(ContentType.JSON).build();
	}
	
	@AfterSuite
	public void asConfig() throws Throwable
	{
		db.closeDB();
	}

}
