package serializationPackage;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoPackage.com.SerializationPojoClass;

public class Deserialization {
	
	@Test
	public void getDeserialization() throws Throwable, JsonMappingException, IOException
	{
		ObjectMapper map= new ObjectMapper();
		SerializationPojoClass data = map.readValue(new File("./serialization.json"), SerializationPojoClass.class);
		System.out.println(data.getPhoneno());
		
	}

}

