package pojoPackage.com;

public class ArrayOfObject {
	
	Object[]data;
	
	Spouse_One dataone;
	
	Spouse_Two datatwo;

	public ArrayOfObject(Object[] data, Spouse_One dataone, Spouse_Two datatwo) {
		super();
		this.data = data;
		this.dataone = dataone;
		this.datatwo = datatwo;
	}

	public Object[] getData() {
		return data;
	}

	public void setData(Object[] data) {
		this.data = data;
	}

	public Spouse_One getDataone() {
		return dataone;
	}

	public void setDataone(Spouse_One dataone) {
		this.dataone = dataone;
	}

	public Spouse_Two getDatatwo() {
		return datatwo;
	}

	public void setDatatwo(Spouse_Two datatwo) {
		this.datatwo = datatwo;
	}
	
	
	
	

	
	
	

	

}
