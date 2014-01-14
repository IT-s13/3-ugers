package player;
import boundaryToMatador.GUI;
public class Refuge extends Field {
	private int bonus; 

	public Refuge(int bonus) {
		this.bonus=bonus; 
		
	}

	@Override
	public void landOnField(Player player, int fieldnum,Field field,boolean prison) {
		
		player.getPlayerAcc().depositMoney(this.bonus);
		GUI.setBalance(player.getPlayerName(), player.getPlayerAcc().getBalance());

	}


	public String toString() {
		String result; 
		TUI tui = new TUI();
		result=tui.refugeField() + bonus; 
		return result; 
	}

	@Override
	public void releaseFields(Player player) {
		// TODO Auto-generated method stub
		
	}
	
}
