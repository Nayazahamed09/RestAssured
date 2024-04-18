package crudOperations;

import java.io.File;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.security.KeyStore;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.GenericUtility.javaUtils;

import io.restassured.RestAssured;
import io.restassured.config.RestAssuredConfig;
import io.restassured.filter.Filter;
import io.restassured.http.ContentType;
import io.restassured.http.Cookie;
import io.restassured.http.Cookies;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.mapper.ObjectMapper;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import io.restassured.specification.AuthenticationSpecification;
import io.restassured.specification.MultiPartSpecification;
import io.restassured.specification.ProxySpecification;
import io.restassured.specification.RedirectSpecification;
import io.restassured.specification.RequestLogSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class CreateProject {

	@Test
	public void createProject()
	{
		javaUtils jlib=new javaUtils();
		//Step1: create pre-requisite for request body
		
		JSONObject Jo =new JSONObject();
		Jo.put("createdBy", "NayazAhamed");
		Jo.put("projectName", "HospitalManagementSystem"+jlib.getRandomNo());
		Jo.put("status", "OnGoing");
		Jo.put("teamSize", 10);
		
		 
		RequestSpecification rs = RestAssured.given(); 
		{
			rs.body(Jo);
			rs.contentType(ContentType.JSON);
			
			// TO GET Response
			Response response = rs.post("http://rmgtestingserver:8084/addProject");
			System.out.println(response.prettyPrint());
			
		}
		}
}
