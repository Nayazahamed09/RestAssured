package arrayOfObjectValidation;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import java.util.List;
import java.util.Map;
public class ArrayObject {
	
	@Test
	public void getArrayObject()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		
		// this method is used to get the single object
		
		when().get("/projects/TY_PROJ_14498")
		//.then().assertThat().body("",Matchers.instanceOf(Map.class)).log().all();
		
		//if we use map.class it will get failed  because map is used for single object(list is used for multiple objects)
		
		
		.then().assertThat().body("",Matchers.instanceOf(List.class)).log().all();
		
	}

}
