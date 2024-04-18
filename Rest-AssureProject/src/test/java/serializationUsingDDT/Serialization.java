package serializationUsingDDT;

import java.io.File;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serialization {
	
	@Test
	public void getSerializatioin() throws Throwable
	{
		Object Sa= new SerializationUsingTwoDimensionalArray();
		
		ObjectMapper map= new ObjectMapper();
		
		map.writerWithDefaultPrettyPrinter().writeValueAsString(Sa);
	}

}
