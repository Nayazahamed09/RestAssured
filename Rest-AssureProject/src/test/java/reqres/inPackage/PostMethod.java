package reqres.inPackage;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.GenericUtility.javaUtils;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostMethod {
	
	@Test
	public void postMethod()
	{
		javaUtils jLib= new javaUtils();
		JSONObject json = new JSONObject();
		
		json.put("name", "morpheus"+jLib.getRandomNo());
		json.put("job", "leader");
		
		// step 1 pre- condition
		
		given().body(json).contentType(ContentType.JSON)
		
		// step 2
		
		.when().post("https://reqres.in/api/users")
		
		// validation
		
		.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
		
		

	}

}
