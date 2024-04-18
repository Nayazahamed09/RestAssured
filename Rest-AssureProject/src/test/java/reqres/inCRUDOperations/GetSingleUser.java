package reqres.inCRUDOperations;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.Matchers;

public class GetSingleUser {
	
	@Test
	public void getSingleUser()
	{
		Response response = RestAssured.get("https://reqres.in/api/users/2");
		response.then().log().all();
		int status=response.getStatusCode();
		Assert.assertEquals(200, status);
	}

}
