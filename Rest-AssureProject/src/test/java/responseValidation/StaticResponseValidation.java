package responseValidation;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class StaticResponseValidation {
	
	@Test
	public void getStaticResponseValidationTest()
	{
		// pre-requisites
		
		String ExpData="TY_PROJ_-1325218320";
		
		baseURI="http://rmgtestingserver";
		port=8084;
		
		//action
		
		Response response = when().get("/projects");
		
		
		// validation
		
		String ActualData=response.jsonPath().get("[5].projectId");
		Assert.assertEquals(ExpData, ActualData);
		System.out.println("data is verified");
		response.then().log().all();
		
	}

}
