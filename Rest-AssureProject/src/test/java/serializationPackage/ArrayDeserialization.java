package serializationPackage;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoPackage.com.ArrayPojoPackage;

public class ArrayDeserialization {
	
	@Test
	public void getArrayDeserialization() throws Throwable, JsonMappingException, IOException
	{
		ObjectMapper map= new ObjectMapper();
		
		 ArrayPojoPackage data = map.readValue(new File("./Array_value"), ArrayPojoPackage.class);
		 System.out.println(data.getPhoneno()[1]);
	}

}
