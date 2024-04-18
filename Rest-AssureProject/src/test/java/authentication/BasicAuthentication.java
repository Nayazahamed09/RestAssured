package authentication;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class BasicAuthentication {
	
	@Test
	public void getBasicAuth()
	{
		given().auth().basic("rmgyantra", "rmgy@9999").when().get("http://rmgtestingserver:8084/login")
		.then().log().all().statusCode(202);
	}
	@Test
	public void getPreemtiveBasicAuth()
	{
		given().auth().preemptive().basic("rmgyantra", "rmgy@9999").when().get("http://rmgtestingserver:8084/login")
		.then().log().all();
	}
	
	@Test
	public void getDigest()
	{
		given().auth().digest("rmgyanra", "rmgy@9999").when().get("http://rmgtestingserver:8084/login").then().log().all();
	}

}
