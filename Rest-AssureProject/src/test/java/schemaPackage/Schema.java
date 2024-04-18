package schemaPackage;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

import static io.restassured.RestAssured.*;

public class Schema {
	
	@Test
	public void schema()
	{
		File file= new File("./schema.json.txt");
		
		when().get("https://reqres.in/api/users?page=2").then()
		.assertThat().body(JsonSchemaValidator.matchesJsonSchema(file)).log().all();
		
	}

}
