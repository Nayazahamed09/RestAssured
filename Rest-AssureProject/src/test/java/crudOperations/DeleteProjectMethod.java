package crudOperations;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class DeleteProjectMethod {
	
	@Test
	public void deleteMethod()
	{
		
		
		// VALIDATION
		
		Response response = RestAssured.delete("http://rmgtestingserver:8084/projects/TY_PROJ_13849");
		response.then().log().all();
		
		int status=response.getStatusCode();
		
		Assert.assertEquals(204, status);
	}

}
