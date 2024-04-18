package differntWaysToPostRequest;

import org.testng.annotations.Test;

import com.GenericUtility.javaUtils;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class UsingHashMap {
	
	@Test
	public void createProjectUsingHashMap()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		javaUtils jLib=new javaUtils();
		HashMap<Object, Object> map = new HashMap<Object, Object >();
		map.put("createdBy", "PawanKalyan");
		map.put("projectName", "OG"+jLib.getRandomNo());
		map.put("status", "Ongoing");
		map.put("teamSize", 20);
		
		//1. pre-condition
		
		given().body(map).contentType(ContentType.JSON)
		
		//2 Actions
		
		.when().post("/addProject")
		
		// validation
		
		.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
	}

}
