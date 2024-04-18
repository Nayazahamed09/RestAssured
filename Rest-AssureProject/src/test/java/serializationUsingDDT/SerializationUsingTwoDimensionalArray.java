package serializationUsingDDT;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializationUsingTwoDimensionalArray {
	
	@DataProvider(name="getData")
	public Object[][] getInformation()
	{
		Object [][] Data= new Object[2][2];
		
		Data[0][0]="Nayaz";
		Data[0][1]="Luicifer";
		
		Data[1][0]="Kiran";
		Data[1][1]="Hamcatcher";
		
		return Data;
	}
	
	
		 
		 
	

}
