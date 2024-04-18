package bddApproach;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class DeleteProject {
	
	@Test
	public void deleteProject()
	{
		when().delete("http://rmgtestingserver:8084/projects/TY_PROJ_13877")
		
		// validation
		
		.then().assertThat().statusCode(204).contentType(ContentType.JSON).log().all();
	}

}
