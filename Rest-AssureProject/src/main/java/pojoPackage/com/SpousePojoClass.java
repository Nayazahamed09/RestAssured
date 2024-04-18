package pojoPackage.com;

public class SpousePojoClass {
	
	String Name;
	int age;
	int phno[];
	
	
	
	
	public SpousePojoClass(String name, int age, int[] phno) {
		super();
		Name = name;
		this.age = age;
		this.phno = phno;
	}

	
	public  SpousePojoClass()
	{
		
	}



	public String getName() {
		return Name;
	}




	public void setName(String name) {
		Name = name;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public int[] getPhno() {
		return phno;
	}




	public void setPhno(int[] phno) {
		this.phno = phno;
	}
	
	
	
	
	
	

}
