package player;

public class LaborCamp extends Ownable {
	private int baseRent;

	public LaborCamp(int price, Player owner) {
		super(price, owner);
		baseRent = 100;
	}

	@Override
	public int getRent() {
		Dicecup dicecup = new Dicecup();
		int rent = 1;
		if (owner.getLabor() == 1) {
			dicecup.roll();
			rent = baseRent * dicecup.getSum();
		}
		if (owner.getLabor() == 2) {
			dicecup.roll();
			rent = baseRent * dicecup.getSum() * 2;
		}
		return rent;

	}

}
