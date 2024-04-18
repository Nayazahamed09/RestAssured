package pojoPackage.com;

public class EmployeeClass{
	
	String Ename;
	String ID;
	int age;
	int[] phno;
	SpousePojoClass spouse;
	public EmployeeClass(String ename, String iD, int age, int[] phno, SpousePojoClass spouse) {
		super();
		Ename = ename;
		ID = iD;
		this.age = age;
		this.phno = phno;
		this.spouse = spouse;
		
		
	
	
	}
	
	public EmployeeClass()
	{
		
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
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
	public SpousePojoClass getSpouse() {
		return spouse;
	}
	public void setSpouse(SpousePojoClass spouse) {
		this.spouse = spouse;
	}
	
	
	

}
