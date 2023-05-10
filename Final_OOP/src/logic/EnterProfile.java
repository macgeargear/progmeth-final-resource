package logic;

public class EnterProfile {
	
	private Person person;
	private int bodyTemperature;
	
	public EnterProfile(Person person, int bodyTemperature) {
		
		this.person = person;
		this.setBodyTemperature(bodyTemperature);
		
	}

	public int getBodyTemperature() {
		return bodyTemperature;
	}
	
	public boolean hasFever() {
		
		return this.bodyTemperature >= 37;
	}

	public void setBodyTemperature(int bodyTemperature) {
		
		if (bodyTemperature < 35) {	
			this.bodyTemperature = 35;
		} else if (bodyTemperature > 42) {
			this.bodyTemperature = 42;
		} else {
			this.bodyTemperature = bodyTemperature;
		}
		
	}

	public Person getPerson() {
		return person;
	}
	
	

}
