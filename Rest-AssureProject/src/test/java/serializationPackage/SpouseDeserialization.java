package serializationPackage;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoPackage.com.EmployeeClass;

public class SpouseDeserialization {
	
	@Test
	public void getDeserialization() throws Throwable, JsonMappingException, IOException
	{
		ObjectMapper map= new ObjectMapper();
		
		EmployeeClass data = map.readValue(new File("./Array_Spouse"), EmployeeClass.class);
		System.out.println(data.getEname());
		
		
	}

}
