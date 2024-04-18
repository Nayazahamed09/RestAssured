package reqres.inCRUDOperations;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SingleUserNotFound {
	
	
	@Test
	public void userNotFound()
	{
		Response response = RestAssured.get("https://reqres.in/api/users/23");
	}

}
