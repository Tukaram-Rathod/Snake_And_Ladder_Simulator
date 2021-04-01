package snakeladder;
import java.util.Random;
public class Snake_Ladder_Simulator {

	public static void main(String[] args) {
		//variables
		int positionplayer1 = 0;
		int positionplayer2 = 0;
		int counterP1 = 0;
		int counterP2 = 0;
		final int WINNING_POSITION = 100;
	
		//using while loop
		while(positionplayer1 <= WINNING_POSITION  && positionplayer2 <= WINNING_POSITION) {	
			Random rand = new Random();
			int diceValue1 = rand.nextInt(6)+1;
			System.out.println("PLAYER1 --> ");
			System.out.println("Dice Value is ==> " +diceValue1);
			int option = rand.nextInt(3);
			//check condition in switch
			counterP1++;
			if(positionplayer1 == WINNING_POSITION) {
				System.out.println("<==============>PLAYER1 WON THE GAME<===============>");
				break;
				}
			switch(option) {
				case 0:
					System.out.println("#NO PLAY");
					break;
				case 1:
					System.out.println("#LADDER");
					positionplayer1 += diceValue1;
					System.out.println("Current Position is ==>" + positionplayer1);
					
					if(positionplayer1 > 100) { 
						positionplayer1 = positionplayer1 - diceValue1;
					System.out.println("Current Position is ==>" + positionplayer1);	
					}
					break;
				case 2:
					System.out.println("#SNAKE");
					positionplayer1 -= diceValue1;
					System.out.println("Current Position is ==>" + positionplayer1);
					
					if(positionplayer1 < 0) { 
						positionplayer1 = 0;
					System.out.println("Current Position is ==>" + positionplayer1);	
					}
					break;
				default:
					System.out.println("NOT CORRECT");
			}
			System.out.println("Dice Roll Count for Player1 ===>"+counterP1);
			System.out.println("-----------------------------------------------------");
		
		//player2
			
			Random rand2 = new Random();
			int diceValue2 = rand.nextInt(6)+1;
			System.out.println("PLAYER2 --> ");
			System.out.println("Dice Value is ==> " +diceValue2);
			int option2 = rand.nextInt(3);
			counterP2++;
			if(positionplayer2 == WINNING_POSITION){
				System.out.println("<==============>PLAYER2 WON THE GAME<===============>");
				break;
				}
			switch(option2) {
				case 0:
					System.out.println("#NO PLAY");
					break;
				case 1:
					System.out.println("#LADDER");
					positionplayer2 += diceValue2;
					System.out.println("Current Position is ==>" + positionplayer2);
					
					if(positionplayer2 > 100) { 
						positionplayer2 = positionplayer2 - diceValue2;
					System.out.println("Current Position is ==>" + positionplayer2);	
					}
					break;
				case 2:
					System.out.println("#SNAKE");
					positionplayer2 -= diceValue2;
					System.out.println("Current Position is ==>" + positionplayer2);
					
					if(positionplayer2 < 0) { 
						positionplayer2 = 0;
					System.out.println("Current Position is ==>" + positionplayer2);	
					}
					break;
				default: 
					System.out.println("NOT CORRECT");
				
			}
			System.out.println("Dice Roll Count for Player2 ===>"+counterP2);
			System.out.println("-------------------------------------------------");
			
		}
		
		if(positionplayer1==WINNING_POSITION) 
			System.out.println("***PLAYER 1 WON THE GAME***");
		else
			System.out.println("***PLAYER 2 WON THE GAME***");
	}	
}
	
