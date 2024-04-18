package crudOperations;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.GenericUtility.javaUtils;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class PutMethod {
	
	@Test
	public void PutMethod()
	{
		javaUtils jLib= new javaUtils();
		JSONObject jo = new JSONObject();
		
		jo.put("createdBy", "kiran");
		jo.put("projectName", "HospitalManagementSystem"+jLib.getRandomNo());
		jo.put("status", "completed");
		jo.put("teamSize", 12);
		
		
		
		RequestSpecification rs = RestAssured.given();
		rs.body(jo);
		rs.contentType(ContentType.JSON);
		
		
		Response response = rs.put("http://rmgtestingserver:8084/projects/TY_PROJ_13849");
		// validation
		
		response.then().log().all();
		
		 int Status=response.getStatusCode();
		 
		 Assert.assertEquals(200, Status);
	}

}
