package differntWaysToPostRequest;

import org.testng.annotations.Test;

import com.GenericUtility.javaUtils;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import pojoPackage.com.PojoClass;

public class UsingPojoClass {
	
	
	
	@Test
	public void createProject()
	{
		javaUtils jlib= new javaUtils();
		//1. Step 1: Create the object for pojo class
		
		PojoClass PJ = new PojoClass("nayazahamed", "ONLINEPAYMENT"+jlib.getRandomNo(), "ONGOING", 15);
		
		// Pre- condition
		
		given().body(PJ).contentType(ContentType.JSON)
		
		// Actions
		
		.when().post("http://rmgtestingserver:8084/addProject")
		
		// Validation
		
		.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
		
		
		
		
	}

}
