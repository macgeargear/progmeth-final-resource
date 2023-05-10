package fighters.derived;

import fighters.base.Attackable;
import fighters.base.Guardable;
import fighters.base.Unit;
import logic.BattleUtils;

public class Guildmaster extends Unit implements Attackable, Guardable {

	public Guildmaster(int maxHealth, int speed, int power, int defense, int location) {
		super("Guildmaster", "G", maxHealth, speed, location, false);
		// TODO Auto-generated constructor stub
		setRange(1);
		setPower(power);
		setDefense(defense);
	}
	
	@Override
	public boolean move(int spaces) {
		return super.move(-1);
	}

	@Override
	public void guard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int attack(Unit e) {
		// TODO Auto-generated method stub
		if (this.sameTeam(e) || !BattleUtils.validRange(getRange(), getLocation(), e.getLocation())) return -1;
		return BattleUtils.calculateDamage(power, e);
		
	}

}
