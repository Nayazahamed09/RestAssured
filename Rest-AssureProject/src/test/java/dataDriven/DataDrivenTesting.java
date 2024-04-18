package dataDriven;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.GenericUtility.javaUtils;

import io.restassured.http.ContentType;
import pojoPackage.com.PojoClass;
import static io.restassured.RestAssured.*;

public class DataDrivenTesting {
	
	@DataProvider(name="getData")
	public Object[][] data()
	{
		Object[][] D= new Object[3][4];
		D [0][0]="Nayaz";
		D [0][1]="LifeTime";
		D [0][2]="Completed";
		D [0][3]=12;
		
		
		D [1][0]="KiranKumar";
		D [1][1]="LifeTimeAchivement";
		D [1][2]="ONGOING";
		D [1][3]=16;
		
		D [2][0]="Nicolas";
		D [2][1]="LifeTimeAward";
		D [2][2]="In Progress";
		D [2][3]=17;
		
		return D;
	}
	
	@Test(dataProvider="getData")
	public void getDDT(String createdBy,String projectName,String status,int teamSize)
	{
		javaUtils jlib= new javaUtils();
		
		PojoClass Pj= new PojoClass(createdBy, projectName+jlib.getRandomNo(), status, teamSize);
		baseURI="http://rmgtestingserver";
		port=8084;
		given().body(Pj).contentType(ContentType.JSON).when().post("/addProject").then().assertThat().statusCode(201).log().all();
	}

}
