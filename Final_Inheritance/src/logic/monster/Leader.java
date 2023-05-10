package logic.monster;

import logic.attack.Attack;

public class Leader extends Monster {

	
	private int maxChargeTurns;
	private int currentChargeTurns;
	private boolean isGuard;
	
	
	public Leader(String name, int hp, int def, int sp_def, Attack attack, int chargeTurns) {
		super(name, hp, def, sp_def, attack);
		// TODO Auto-generated constructor stub
		setMaxChargeTurns(chargeTurns);
		setCurrentChargeTurns(0);
	}
	
	@Override
	public int takeDamage(Attack attack) {
		
		if (isGuard) return 0;
		
		if (attack.isLeader()) {
			setHp(this.getHp() - attack.calculateDamage(this));
		} else {

			setHp((int) Math.ceil(this.getHp() - attack.calculateDamage(this)*0.5));
		}
		
		if (this.getHp() == 0) {
			isDead = true;
		}
		
		return attack.calculateDamage(this);
	}
	
	public boolean isReady() {
		
		return this.currentChargeTurns >= this.maxChargeTurns;
	}


	public int getMaxChargeTurns() {
		return maxChargeTurns;
	}


	public void setMaxChargeTurns(int maxChargeTurns) {
		this.maxChargeTurns = maxChargeTurns;
	}


	public int getCurrentChargeTurns() {
		return currentChargeTurns;
	}


	public void setCurrentChargeTurns(int currentChargeTurns) {
		
		if (currentChargeTurns < 0) {
			this.currentChargeTurns = 0;
		} else if (currentChargeTurns > maxChargeTurns) {
			this.currentChargeTurns = maxChargeTurns;
		} else {
			this.currentChargeTurns = currentChargeTurns;
		}
	}


	public boolean isGuard() {
		return isGuard;
	}


	public void setGuard(boolean isGuard) {
		this.isGuard = isGuard;
	}

}
