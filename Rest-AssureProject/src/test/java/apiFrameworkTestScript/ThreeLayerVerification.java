package apiFrameworkTestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.GenericUtility.BaseClass;
import com.GenericUtility.IpathConstants;
import com.GenericUtility.javaUtils;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.time.Duration;

public class ThreeLayerVerification extends BaseClass{
	
	@Test
	public void initiateThreeLayerMethod() throws Throwable
	{
		// Create Project Using Selenium
		
		
		WebDriverManager.chromedriver().setup();
		javaUtils jlib=new javaUtils();

		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		String projectName="Transformers"+jlib.getRandomNo();
		driver.get("http://rmgtestingserver:8084");
		driver.findElement(By.id("usernmae")).sendKeys(IpathConstants.APPUSRNAME);
		driver.findElement(By.id("inputPassword")).sendKeys(IpathConstants.appPassword);
		driver.findElement(By.xpath("//button[.='Sign in']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Projects']")).click();
		driver.findElement(By.xpath("//span[text()='Create Project']")).click();
		driver.findElement(By.xpath("//input[@name='projectName']")).sendKeys(projectName);

		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@name='createdBy']")).sendKeys("NayazAhamed");
		WebElement ele = driver.findElement(By.xpath("//div[@class='ReactModal__Overlay ReactModal__Overlay--after-open' and contains(.,'Create Project')]/descendant::select[@name='status']"));
		Select s= new Select(ele);
		s.selectByVisibleText("On Gogin");
		driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();
		
		Thread.sleep(5000);
		
		 String id = driver.findElement(By.xpath("//table[@class='table table-striped table-hover']/tbody/tr[contains(.,'"+projectName+"')]/td[1]")).getText();
		//String id = driver.findElement(By.xpath("//tbody/tr[contains(.,'"+projectName+"')]/td[1]")).getText();
		  System.out.println(id);
		  
		  // Using Api
		  
		 Response res = when().get("http://rmgtestingserver:8084/projects/"+id+"");
		 res.then().log().all();
		// check wheather it is in database
		 
		 db.getConnectiontoDatabase();
		 db.createStatementforDatabaseandgetData("select * from project;", 1, id);
		 db.closeDB();
		
	}
	
	

}
