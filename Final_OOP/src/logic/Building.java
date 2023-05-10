package logic;

import java.util.ArrayList;

public class Building {
	private ArrayList<EnterProfile> enterProfileList;

	private int populationCount = 0;
	private int potentialInfectedCount = 0;
	
	public Building() {
		enterProfileList = new ArrayList<EnterProfile>();
	}

	public EnterProfile addProfile(Person person, int temperature) {
		
		EnterProfile theOne = new EnterProfile(person, temperature);
		
		for (int i = 0; i < enterProfileList.size(); i++) {
			if (enterProfileList.get(i).getPerson().getID() == person.getID()) {
				removeProfile(i);
			}
		}
	
		populationCount++;
		
		if (theOne.hasFever()) {
			potentialInfectedCount++;
		}
		
		enterProfileList.add(theOne);
		return theOne;
	}
	
	
	public EnterProfile removeProfile(int index) {
		
		if (this.enterProfileList.get(index).hasFever()) {
			this.potentialInfectedCount--;
		}
		
		this.populationCount--;
		return this.enterProfileList.remove(index);
		
		
	}
	


	public int getPopulationCount() {
		return populationCount;
	}

 

	public int getPotentialInfectedCount() {
		return potentialInfectedCount;
	}

	public ArrayList<EnterProfile> getEnterProfileList() {
		return enterProfileList;
	}
}
