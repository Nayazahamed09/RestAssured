package differntWaysToPostRequest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.GenericUtility.javaUtils;

import io.restassured.http.ContentType;

public class UsingJSONobject {
	
	@Test
	public void createProject()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		javaUtils jLib= new javaUtils();
		
		JSONObject json= new JSONObject();
		
		json.put("createdBy", "nayazahamed");
		
		json.put("teamSize", 15);
		
		json.put("projectName", "LifeCycle"+jLib.getRandomNo());
		
		json.put("status", "OnGoing");
		
		// step 1 : pre- condition
		
		given().body(json).contentType(ContentType.JSON)
		
		//actions
		
		.when().post("/addProject")
		
		//validate
		.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
		
	}
	

}
