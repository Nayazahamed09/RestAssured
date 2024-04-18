package authentication;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import  static io.restassured.RestAssured.*;

public class Oauth2 {
	
	@Test
	public void getAuth2()
	{
	  Response res = given().formParam("client_id", "OuathApplication")
	   .formParam("client_secret", "c460eef240bc58823234599a8e7e8067")
	   
	   .formParam("grant_type", "client_credentials")
	   .formParam("redirect_uri", "http://example.com")
	   .formParam("code", "authorization_code")
	   .when().post("http://coop.apps.symfonycasts.com/token ");
	  
	   String Token = res.jsonPath().get("access_token");
	   
	   System.out.println(Token);
	   
	   
	   // another request
	   
	   given().auth().oauth2(Token).pathParam("USER_ID","4856" ).when().post("http://coop.apps.symfonycasts.com/api/{USER_ID}/eggs-count")
	   .then().log().all();
	}

}
