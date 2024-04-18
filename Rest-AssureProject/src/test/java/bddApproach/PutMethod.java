package bddApproach;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.GenericUtility.javaUtils;

import io.restassured.http.ContentType;

public class PutMethod {
	
	
	@Test
	public void putMethod()
	{
		javaUtils jLib= new javaUtils();
		JSONObject json = new JSONObject();
		
        json.put("createdBy", "Badrinath");
		
		json.put("teamSize", 12);
		
		json.put("projectName", "LifeCycle"+jLib.getRandomNo());
		
		json.put("status", "completed");
		
		// step 1 pre-condition
		
		given().body(json).contentType(ContentType.JSON)
		
		// step 2 : Actions
		
		.when().put("http://rmgtestingserver:8084/projects/TY_PROJ_13877")
		
		// step 3 : Verification
		
		.then().assertThat().statusCode(200).contentType(ContentType.JSON).log().all();
		

	}

}
