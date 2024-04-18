package apiFrameworkTestScript;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

import com.GenericUtility.BaseClass;
import com.GenericUtility.EndPoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoPackage.com.PojoClass;
import static io.restassured.RestAssured.*;

public class Script_One extends BaseClass
{
	@Test
	public void getCreateProject() throws Throwable
	{
		PojoClass Pj= new PojoClass("NayazAhmad", "Avengers"+jlib.getRandomNo(), "OnGoing", 15);
		
		  Response res = given().spec(reqst).body(Pj).when().post(EndPoints.createProject);
//		  
		  String data=RA.getJsonDataResponse(res, "projectId");
		System.out.println(data);
		
		// validation
		
		
		db.getConnectiontoDatabase();
		db.createStatementforDatabaseandgetData("select * from project;", 1, data);
		res.then().contentType(ContentType.JSON).log().all();
		db.closeDB();
		
		
		
	}
}


			
			

