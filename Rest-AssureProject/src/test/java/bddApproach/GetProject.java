package bddApproach;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import  static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class GetProject {
	
	@Test
	public void getAllProjects()
	{
		when().get("http://rmgtestingserver:8084/projects/TY_PROJ_13987")
		
		// validation
		
		.then().assertThat().time(Matchers.lessThan(5000l),TimeUnit.MILLISECONDS).statusCode(200).log().all();
	
		
		
	}

}
