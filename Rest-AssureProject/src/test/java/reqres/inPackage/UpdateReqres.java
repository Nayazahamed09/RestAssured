package reqres.inPackage;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UpdateReqres {
@Test
public void updateUser()
{
	JSONObject json=new JSONObject();
	json.put("name", "morpheus");
	json.put("job", "zion resident");
	
	given().body(json).contentType(ContentType.JSON)
	
	.when().patch("https://reqres.in/api/users/2")
	
	.then().assertThat().statusCode(200).contentType(ContentType.JSON).log().all();
		
}
}
