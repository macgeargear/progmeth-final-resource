package fighters.derived;

import fighters.base.Attackable;
import fighters.base.Guardable;
import fighters.base.Unit;
import logic.BattleUtils;

public class Wizard extends Unit implements Attackable {

	public Wizard(int maxHealth, int speed, int power, int location) {
		super("Wizard", "w", maxHealth, speed, location, true);
		// TODO Auto-generated constructor stub
		this.setRange(2);
		setPower(power);
	}

	@Override
	public int attack(Unit e) {
		// TODO Auto-generated method stub
		if (this.sameTeam(e) || !BattleUtils.validRange(getRange(), getLocation(), e.getLocation())) return -1;
		return getPower();
		
	}

}
