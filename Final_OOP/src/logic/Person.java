package logic;

public class Person {
	
	private String name;
	private int ID;
	
	public Person(String name, int ID) {
		
		this.setName(name);;
		this.setID(ID);
		
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = Math.max(1, iD);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	

}
