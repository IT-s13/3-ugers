package player;

import boundaryToMatador.GUI;

abstract class Ownable extends Field {
	protected int price;
	protected Player owner;
	TUI tui = new TUI();

	public Ownable(int price, Player owner) {
		this.price = price;
		this.owner = owner;

	}

	@Override
	public void landOnField(Player player, int fieldnum, Field field,boolean prison) {

		if (owner == null) {
			boolean choice = GUI.getUserLeftButtonPressed(
					tui.buyproperty(), tui.yes(), tui.no());
			if (choice == true) {
				if(player.getPlayerAcc().getBalance() > price){
				player.getPlayerAcc().withdrawMoney(price);
				owner = player;
				if (field instanceof Fleet) {
					player.updateFleet();
				}
				if (field instanceof LaborCamp) {
					owner.updateLabor();
				}
				GUI.setBalance(player.getPlayerName(), player.getPlayerAcc()
						.getBalance());
				GUI.setOwner(fieldnum, player.getPlayerName());}
				else {
					GUI.showMessage(tui.cantAfford());
					
				}
			}

		}
		if (owner != null && owner != player) {
			owner.getPlayerAcc().depositMoney(getRent());
			player.getPlayerAcc().withdrawMoney(getRent());
			GUI.setBalance(player.getPlayerName(), player.getPlayerAcc()
					.getBalance());
			GUI.setBalance(owner.getPlayerName(), owner.getPlayerAcc()
					.getBalance());
			GUI.getUserButtonPressed(tui.theOwneris() + owner.getPlayerName()
					+ tui.mustPay() + getRent(), tui.ok());

		}

	}

	public void releaseFields(Player player) {
		if (player.equals(owner)) {
			owner = null;
			System.out.println(owner);

		}

	}

	public abstract int getRent();

	public String toString() {
		String result;
		result = tui.thePriceis()  + price + tui.theOwneris() + owner;
		return result;

	}

}
