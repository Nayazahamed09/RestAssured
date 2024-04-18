package crudOperations;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class GetProject {
	
	@Test
	public void getProject()
	{
		
		
		
		// Step 1: Create a pre-requisite
		
		// Step 2: Perform the Action
		
		
		
		
		Response rs = RestAssured.get("http://rmgtestingserver:8084/project/TY_PROJ_13849");
		
		//Step3: validation
		
		rs.then().log().all();
		 int Status=rs.getStatusCode();
		 
		 Assert.assertEquals(200, Status);
	}

}
 