package responseValidation;

import org.junit.Assert;
import org.testng.annotations.Test;

import groovyjarjarantlr.collections.List;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;




public class DynamicResponseValidation {
	
	@Test
	public void getDynamicResponseValidationTest()
	{
		String ExpData="TY_PROJ_-1325218320";
		baseURI="http://rmgtestingserver";
		port=8084;
		
		//Action
		
		Response response = when().get("/projects");
		
		//validation
		
		boolean flag=false;
		
		 java.util.List<String>pIds = response.jsonPath().get("projectId");
		
		for (String ID:pIds) 
		{
			if(ID.equalsIgnoreCase(ExpData))
			{
				flag=true;
			}
			
		}
		Assert.assertTrue(flag);
		System.out.println("DATA IS VERIFIED");
		response.then().log().all();
	}

}
