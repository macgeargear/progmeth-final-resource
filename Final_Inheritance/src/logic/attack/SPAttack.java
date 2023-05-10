package logic.attack;

import logic.monster.Monster;

public class SPAttack extends Attack {

	public SPAttack(int power, String name, boolean isLeader) {
		super(power, name, isLeader);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int calculateDamage(Monster target) {
		
		return Math.max(0, power - target.getSpecialDefense());
	}

}
