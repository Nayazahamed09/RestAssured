package pojoPackage.com;

public class PojoClass {
	
	// 1. Declare variables Globally
	
	String createdBy;
	
	String projectName;
	
	String status;
	
	int teamSize;
	
	
	//2 Create a constructor to initialize the variables


	public PojoClass(String createdBy, String projectName, String status, int teamSize) 
	{
		super();
		this.createdBy = createdBy;
		this.projectName = projectName;
		this.status = status;
		this.teamSize = teamSize;
	}
	//3 set getters and setters method


	public String getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}


	public String getProjectName() {
		return projectName;
	}


	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public int getTeamSize() {
		return teamSize;
	}


	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	
	
	
		
	

}
