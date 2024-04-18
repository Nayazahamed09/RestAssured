package reqres.inCRUDOperations;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class ListUsers {
	
	@Test
	public void getUsersList()
	{
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		
		response.then().log().all();
		
		int Status=response.getStatusCode();
		
		Assert.assertEquals(200, Status);
	}

}
