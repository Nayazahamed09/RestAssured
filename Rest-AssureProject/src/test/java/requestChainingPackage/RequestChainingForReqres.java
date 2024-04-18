package requestChainingPackage;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.GenericUtility.javaUtils;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojoPackage.com.PojoClass;

import static io.restassured.RestAssured.*;

import java.util.List;

public class RequestChainingForReqres {
	
	@Test
	public void getRequestChaining()
	{
		baseURI="https://reqres.in";
		
		javaUtils jlib = new javaUtils();
		
		// 1. create  request
		
		/*JSONObject jo= new JSONObject();
		
		jo.put("name", "morpheus"+jlib.getRandomNo());
		
		jo.put("job", "leader");*/
		
		int expdata=7;
		
		Response res = when().get("/api/users?page=2");
		
		boolean flag=false;
		
		List<Integer>ids=res.jsonPath().get("data.id");
		
		for(int id:ids)
		{
			if(id==expdata)
			{
				flag = true;
				when().get("/api/users/"+7);
				Assert.assertTrue(flag);
				res.then().statusCode(200).log().all();
			}
		}
		//Assert.assertTrue(flag);
		//res.then().statusCode(200).log().all();
				
		
		when().get("/api/users/"+ids)
		
		.then().statusCode(200).log().all();
		
	    /*Response res = given().body(jo).contentType(ContentType.JSON).when().post("/api/users");
		
		String ID=res.jsonPath().get("id");
		System.out.println(ID);
		
		res.then().assertThat().statusCode(201).log().all();
		
		// create another request
		
		when().put("/api/users/"+ID).then().assertThat().statusCode(200).log().all(); */
		
		
	
	  
	  
	  
	   
	}

}
