package requestChainingPackage;

import org.testng.annotations.Test;

import com.GenericUtility.javaUtils;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojoPackage.com.PojoClass;

import static io.restassured.RestAssured.*;

public class RequestChaining {
	
	@Test
	public void initiateRequestChainingMethod()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		
		// 1 step Post the Request
	javaUtils jlib= new javaUtils();
		PojoClass pj= new PojoClass("Nayazahamed", "HospitalCareSystem"+jlib.getRandomNo(), "ONGOING", 10);
		
		RequestSpecification response = given().body(pj).contentType(ContentType.JSON);
		
		Response res = response.when().post("/addProject");
		
		String projectID=res.jsonPath().get("projectId");
		
		System.out.println(projectID);
		
		// validation
		
		res.then().assertThat().statusCode(201).log().all();
		
		// create another request
		
		given().pathParam("pid", projectID).pathParam("Project", "projects").when().get("/{Project}/{pid}");
				
	}

}
