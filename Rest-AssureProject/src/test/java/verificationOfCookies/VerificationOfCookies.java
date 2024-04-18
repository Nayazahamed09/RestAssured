package verificationOfCookies;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import  static io.restassured.RestAssured.*;


public class VerificationOfCookies {
	
	@Test
	public void getCookies()
	{
	
		Response res = when().post("https://www.google.com");
		// to get single cookie
		String value = res.getCookie("1P_JAR");
		
		System.out.println(value);
	}
	
	
	@Test
	public void getMultipleCookies()
	{
		given().when().get("https://www.google.com")
		.then().cookie("1P_JAR").cookie("AEC").cookie("NID").log().all();
	}
	
	
	@Test
	public void addCookies()
	{
		given().cookies("1P_JAR","2024-02-28-05",
				 "AEC","Ae3NU9OHFqVjmpWgjet2dNw0cV5RL2gPyFPo_pfdORQttTxi72S-ksm_KQ",
				  "NID","512%3DRaH7a0_Lh6KvoGWnrsgORceI0KH6-VH_qRi2IOPH5Y7HiCEXcvmnr-daI4bUDbrx5GPDRcD3MSAnSBZTpUFJzTc0B_FapvfOrHJFJUkGSkHLkQ-giwIkZc_q4Za1p268d3W6-hd-lz9w7PDsVodBXqcgXCDyR-SIiS567a9OQHU")
		.when().get("https://www.google.com").then().log().all()
;	}
}
