package responseValidation;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class StaticResponseValidationInReqres {
	
	@Test
	public void getStaticResponse()
	{
		String ExpData="Michael";
		baseURI="https://reqres.in";
		
		// action
		
		Response response = when().get("/api/users?page=2");
		
		// validation
		
		String ActualData=response.jsonPath().get("data[0].first_name");
		
		Assert.assertEquals(ExpData, ActualData);
		System.out.println("data is verified");
		response.then().log().all();
		
	}

}
