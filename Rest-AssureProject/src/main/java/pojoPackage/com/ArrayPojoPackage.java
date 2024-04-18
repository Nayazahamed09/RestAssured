package pojoPackage.com;

public class ArrayPojoPackage {
	
	String EmpName;
	int[] Phoneno;
	int age;
	
	
	public ArrayPojoPackage(String empName, int[] phoneno, int age) {
		super();
		EmpName = empName;
		Phoneno = phoneno;
		this.age = age;
	}
	
	
	public ArrayPojoPackage()
	{
		
	}




	public String getEmpName() {
		return EmpName;
	}


	public void setEmpName(String empName) {
		EmpName = empName;
	}


	public int[] getPhoneno() {
		return Phoneno;
	}


	public void setPhoneno(int[] phoneno) {
		Phoneno = phoneno;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	

}
