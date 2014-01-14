package player;

public class GameBoard {
	private Field[] fields = new Field[40];

	public GameBoard() {
		
		
		Home Start = new Home(4000);
		Territory Rødovrevej = new Territory(1200, null, 100);
		Chance chance1 = new Chance();
		Territory Hvidovrevej = new Territory(1200, null, 100);
		Tax tax1 = new Tax(4000);
		Fleet øresund = new Fleet(4000, null);
		Territory Roskildevej = new Territory(2000, null, 200);
		Chance chance2 = new Chance();
		Territory Valby_Langgade = new Territory(2000, null, 200);
		Territory Allégade = new Territory(2400, null, 250);
		Jail besøg = new Jail();
		Territory Frederiksberg_Allé = new Territory(2800, null, 300);
		Brewery Tuborg = new Brewery(2500, null);
		Territory Bülowsvej = new Territory(2800, null, 300);
		Territory Gl_Kongevej = new Territory(3200, null, 350);
		Fleet dfds = new Fleet(4000, null); 
		Territory Bernstorffsvej = new Territory(3800, null , 400);
		Chance chance3 = new Chance();
		Territory Hellerupvej = new Territory(3800, null, 400);
		Territory Strandvejen = new Territory(4000, null, 450); 
		Refuge Parkering = new Refuge(4000); 
		Territory Trianglen = new Territory(4400, null , 500);
		Chance chance4 = new Chance();
		Territory Østerbrogade = new Territory(4400, null, 500);
		Territory Grønningen = new Territory(4800, null, 550);
		Fleet ø_s = new Fleet(4000, null); 
		Territory Bredgade = new Territory(5200, null, 650);
		Territory Kgs_Nytorv = new Territory(5200, null ,650);
		Brewery Carlsberg = new Brewery(2500, null); 
		Territory Østergade = new Territory(5600, null, 700); 
		Jail fængsel = new Jail();
		Territory Amagertorv = new Territory(6000, null, 750); 
		Territory Vimmelskaftet = new Territory(6000, null, 750);
		Chance chance5 = new Chance();
		Territory Nygade = new Territory(6400, null, 850);
		Fleet bornholm = new Fleet(4000, null);
		Chance chance6 = new Chance();
		Territory Frederiksberggade = new Territory(7000, null , 950); 
		Tax tax2 = new Tax(2000);
		Territory Rådhuspladsen = new Territory(8000, null, 1050);
		


		fields[1] = Start;
		fields[2] = Rødovrevej;
		fields[3] = chance1;
		fields[4] = Hvidovrevej;
		fields[5] = tax1;
		fields[6] = øresund;
		fields[7] = Roskildevej;
		fields[8] = chance2;
		fields[9] = Valby_Langgade;
		fields[10] = Allégade;
		fields[11] = besøg;
		fields[12] = Frederiksberg_Allé;
		fields[13] = Tuborg;
		fields[14] = Bülowsvej;
		fields[15] = Gl_Kongevej;
		fields[16] = dfds;
		fields[17] = Bernstorffsvej;
		fields[18] = chance3;
		fields[19] = Hellerupvej;
		fields[20] = Strandvejen; 
		fields[21] = Parkering;
		fields[22] = Trianglen; 
		fields[23] = chance4; 
		fields[24] = Østerbrogade;
		fields[25] = Grønningen; 
		fields[26] = ø_s;
		fields[27] = Bredgade;
		fields[28] = Kgs_Nytorv;
		fields[29] = Carlsberg; 
		fields[30] = Østergade; 
		fields[31] = fængsel; 
		fields[32] = Amagertorv; 
		fields[33] = Vimmelskaftet; 
		fields[34] = chance5; 
		fields[35] = Nygade; 
		fields[36] = bornholm;
		fields[37] = chance6; 
		fields[38] = Frederiksberggade; 
		fields[39] = tax2; 
		fields[40] = Rådhuspladsen; 

				
				

	}

	public Field getField(int diceSum) {

		return fields[diceSum];

	}

}
