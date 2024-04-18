package authentication;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.GenericUtility.javaUtils;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class BearerToken {
	
	@Test
	public void getBearerToken()
	{
		final String Token="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";
		javaUtils jlib= new javaUtils();
		JSONObject jo= new JSONObject();
		jo.put("name", "BearerRepository"+jlib.getRandomNo());
		given().auth().oauth2(Token).body(jo).contentType(ContentType.JSON).when().post("https://api.github.com/user/repos")
		
		.then().statusCode(201).contentType(ContentType.JSON).log().all();
	}

}
