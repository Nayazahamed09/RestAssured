package responseBodyValidation;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.http.Headers;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class ResponseHeaderValidaton_Test {
	
	@Test
	public void getResponseHeaderValidation()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		
		String expected_statusline="HTTP/1.1 200 ";
		String expected_Vary="Access-Control-Request-Headers";
		String expected_ContentType="application/json";
		String expected_pragma="no-cache";
		String expected_connection="keep-alive";
		
		Response response = when().get("/projects/TY_PROJ_14437");
		response.then().log().all();
		
		String Status_Line=response.statusLine();
		System.out.println(Status_Line);
		
		Assert.assertEquals(Status_Line,expected_statusline);
		
		Headers headers = response.getHeaders();
		System.out.println(headers);
		
		
		
		String actual_contentType=response.getHeader("Content-Type");
		
		Assert.assertEquals(actual_contentType,expected_ContentType);
		
		String actual_pragma=response.getHeader("Pragma");
		
		Assert.assertEquals(actual_pragma,expected_pragma);
		
		
		
		
		
		
		
	}

}
