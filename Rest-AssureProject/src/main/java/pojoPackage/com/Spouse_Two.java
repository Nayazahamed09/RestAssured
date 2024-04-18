package pojoPackage.com;

public class Spouse_Two {
	
	String Ename;
	int Age;
	String id;
	public Spouse_Two(String ename, int age, String id) {
		super();
		Ename = ename;
		Age = age;
		this.id = id;
	}
	
	
	public String getEname() {
		return Ename;
	}

	public void setEname(String ename) {
		Ename = ename;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	

}
