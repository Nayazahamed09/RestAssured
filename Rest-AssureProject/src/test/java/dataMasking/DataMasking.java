package dataMasking;

import org.testng.annotations.Test;

import com.GenericUtility.javaUtils;

import io.restassured.RestAssured;
import io.restassured.config.LogConfig;
import io.restassured.http.ContentType;
import pojoPackage.com.PojoClass;

import static io.restassured.RestAssured.*;

public class DataMasking {
	
	@Test
	public void getDataMasking()
	{
		javaUtils jlib= new javaUtils()
;		PojoClass Pj= new PojoClass("NayazAhmad", "KingKon"+jlib.getRandomNo(), "OnGoing", 20);

		
        given().config(RestAssured.config.logConfig(LogConfig.logConfig().blacklistHeader("Content-Type"))).body(Pj).contentType(ContentType.JSON)
        .when().post("http://rmgtestingserver:8084/addProject").then().assertThat().log().all();
	}

}
