package serializationPackage;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoPackage.com.EmployeeClass;
import pojoPackage.com.SpousePojoClass;

public class SpouseSerialization {
	
	
	@Test
	public void getSerialization() throws Throwable, JsonMappingException, IOException
	{
		ObjectMapper map= new ObjectMapper();
		
		int []empphno= {1234,4569};
		int []spno= {78945,96325};
		SpousePojoClass Sp= new SpousePojoClass("Vikranth", 19, spno);
		EmployeeClass emp= new EmployeeClass("Kiran", "IC581", 12,empphno , Sp);
		map.writerWithDefaultPrettyPrinter().writeValue(new File("./Array_Spouse"), emp);
	}

}
