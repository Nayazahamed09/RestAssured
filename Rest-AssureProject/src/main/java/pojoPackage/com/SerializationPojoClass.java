package pojoPackage.com;

public class SerializationPojoClass {
	
	
	String EmployeeName;
	int Age;
	long phoneno;
	
	
	
	// create a constructor
	
	
	public SerializationPojoClass(String employeeName, int age, long phoneno) {
		super();
		EmployeeName = employeeName;
		Age = age;
		this.phoneno = phoneno;
	}
	
	public SerializationPojoClass()
	{
		
	}
	
	
	
	// get setters and getters method



	public String getEmployeeName() {
		return EmployeeName;
	}



	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}



	public int getAge() {
		return Age;
	}



	public void setAge(int age) {
		Age = age;
	}



	public long getPhoneno() {
		return phoneno;
	}



	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	
	
	
	
	
	
	
	
	
	
	

}
