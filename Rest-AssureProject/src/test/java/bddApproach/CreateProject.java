package bddApproach;

import static io.restassured.RestAssured.*  ;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.GenericUtility.javaUtils;

import io.restassured.http.ContentType;
public class CreateProject {
	
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
		File Image= new File("C:\\Users\\Windows\\Pictures\\Screenshots\\kashmir.jpg");
		// step 1 : pre- condition
		
		given().body(json).multiPart(Image).contentType(ContentType.JSON)
		
		//actions
		
		.when().post("/addProject")
		
		//validate
		.then().assertThat().time(Matchers.lessThan(5000l),TimeUnit.MILLISECONDS).statusCode(201).contentType(ContentType.JSON).log().all();
		
		
		
		
	}
	
	

}
