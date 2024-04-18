package serializationPackage;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoPackage.com.ArrayPojoPackage;

public class ArraySerialization {

	
	
	@Test
	public void getSerialization() throws Throwable, JsonMappingException, IOException
	{
		int[] phno= {1234,4895};
		
		ObjectMapper map= new ObjectMapper();
		
			ArrayPojoPackage Ap= new ArrayPojoPackage("Nayaz", phno, 15);
			
			map.writerWithDefaultPrettyPrinter().writeValue(new File("./Array_value"), Ap);
			
	}
}
