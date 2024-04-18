package com.GenericUtility;

import io.restassured.response.Response;

public class RestAssureLibrary {
	
	/**
	 * This method will return json data from corresponding body
	 * @param response
	 * @param Path
	 * @return
	 */
	
	
	
	public String getJsonDataResponse(Response response,String Path)
	{
		String jsonData=response.jsonPath().get(Path);
		return jsonData;
	}

}
