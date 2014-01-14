package player;

import boundaryToMatador.*;

public class Jail extends Field {

	private int bailamount=1000;
	TUI tui = new TUI();
	Dicecup diceCup = new Dicecup();

	public Jail () {
		  
	}

   
   public void landOnField(Player player,int fieldnum,Field field,boolean prison)
   {
   if(player.getJailcount()<3 || prison == true){
	 
	
		 if(GUI.getUserLeftButtonPressed(tui.PayorRoll(), " betal 1000", "Roll dice")==true){
				player.getPlayerAcc().withdrawMoney(bailamount);
				GUI.setBalance(player.getPlayerName(), player.getPlayerAcc().getBalance());
				player.restartjailcount(); 
			}
		 else {
			 for(int i =0 ; i<=3;i++){
			 diceCup.roll();
			 if(diceCup.getfacevalue1() == diceCup.getfacevalue2()){
			     player.restartjailcount(); 
			     i=4; 
			     }
			 else{
				 player.updatejailcount();
			 }
			} 
	  
	 }
  }
}
   
   
	public void releaseFields(Player player) {
		// TODO Auto-generated method stub	
	}
	
	
}
