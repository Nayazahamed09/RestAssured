package serializationPackage;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoPackage.com.ArrayOfObject;
import pojoPackage.com.Spouse_One;
import pojoPackage.com.Spouse_Two;

public class ArrayOfObjectSerialization {
	
	@Test
	public void getserialization() throws Throwable, JsonMappingException, IOException
	{
		ObjectMapper map= new ObjectMapper();
		
		
		
		

		
Spouse_One sp = new Spouse_One("kiran", 10, "IC585");
Spouse_Two SP2= new Spouse_Two("VIDHYA", 12, "IC587");

Object[] data= {sp,SP2};
		
ArrayOfObject ao= new ArrayOfObject(data, sp, SP2);

map.writerWithDefaultPrettyPrinter().writeValue(new File("./ArrayOfObject"), ao);
		
	
	}

}