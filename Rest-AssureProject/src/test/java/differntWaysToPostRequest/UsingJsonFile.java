package differntWaysToPostRequest;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

public class UsingJsonFile {
	
	@Test
	public void createProject()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		
		// Create Pre-Requisite - RequestBody
		
	
		File F = new File("./data.json");
		
		// Pre-condition
		
		given().body(F).contentType(ContentType.JSON)
		
		// 2 Actions 
		
		.when().post("/addProject")
		
		//3 validation
		
		.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
	}

}
