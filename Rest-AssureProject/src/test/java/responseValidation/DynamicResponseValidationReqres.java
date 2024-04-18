package responseValidation;
import static io.restassured.RestAssured.*;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class DynamicResponseValidationReqres {
	
	@Test
	public void getDyanamicResponse()
	{
		String ExpData="fuchsia rose";
		baseURI="https://reqres.in";
		
		//Actions
		
		Response response = when().get("/api/unknown");
		
		// validation
		
		boolean flag=false;
		
		List<String>names=response.jsonPath().get("data.name");
		for(String name:names)
		{
			if(names.contains(ExpData))
			{
				flag=true;
			}
		}
		Assert.assertTrue(flag);
		System.out.println("Data is verified");
		response.then().log().all();
		
	}

}
