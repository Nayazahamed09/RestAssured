package serializationPackage;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoPackage.com.SerializationPojoClass;







public class Serialization {
	
	@Test
	public void getSerialization() throws Throwable, JsonMappingException, IOException
	{
		
	ObjectMapper map=new ObjectMapper();
	
	SerializationPojoClass sp= new SerializationPojoClass("nayaz", 27, 8919866104l);
	
	map.writerWithDefaultPrettyPrinter().writeValue(new File("./serialization.json"), sp);
		
		
	
	}
}
