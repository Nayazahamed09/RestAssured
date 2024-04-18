package usageOfParameters.com;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Parametres {
	
	@Test
	public void getPathParameter()
	{
		baseURI="https://reqres.in";
		
		// step 2 Action
		given().pathParam("API", "api").pathParam("USERS", "users").
		when().get("/{API}/{USERS}/2").then().statusCode(200).log().all();		
		
		
	}
	
	@Test
	public void getQueryParameter()
	{
		baseURI="https://reqres.in";
		
		// 1 st step
		
		given().pathParam("API", "api").pathParam("USER", "users").queryParam("page", 2).
		
		when().get("/{API}/{USER}").then().statusCode(200).log().all();
	}
	
	@Test
	public void getFormParameter()
	{
		baseURI="https://reqres.in";
		given().formParam("name", "morpheus")
		.formParam("job", "leader").pathParam("API", "api").pathParam("USERS", "users").when().post("/{API}/{USERS}").then().assertThat().statusCode(201).log().all();
	
	}

}
