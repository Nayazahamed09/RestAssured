package requestSpecifiactionBuilder;

import org.testng.annotations.Test;

import com.GenericUtility.javaUtils;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType; 
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojoPackage.com.PojoClass;
import static io.restassured.RestAssured.*;

public class RequestSpecifiactionBuilder {
	
	
	@Test
	public void getRequestAndResponseSpecification()
	{
		javaUtils jlib= new javaUtils();
		PojoClass pc= new PojoClass("NayazAhmad", "Lucifier"+jlib.getRandomNo(), "Ongoing", 12);
		
		  RequestSpecification req = new RequestSpecBuilder()
		 .setBaseUri("http://rmgtestingserver:8084")
		 .setContentType(ContentType.JSON).build();
		 
		  ResponseSpecification res = new ResponseSpecBuilder()
				.expectStatusCode(201).expectContentType(ContentType.JSON).build();
				
				given().spec(req).body(pc).when().post("/addProject").then().spec(res).statusCode(201).log().all();
			
				
	}

}
