package snakeladder;
import java.util.Random;
public class Snake_Ladder_Simulator {

	static int player1;
	static int player2;
	public static void main(String[] args) {
			System.out.println("player1:");
			Player();
			System.out.println("player2:");
			Player();
		}

	static void Player() {
		
		int position = 0;
		int DiceRollCount = 0;
		final int WINNING_POSITION = 100;
		System.out.println("Initial Position ==>" +position);
		while(position <= WINNING_POSITION) {	
			Random rand = new Random();
			int diceValue = rand.nextInt(6)+1;
			System.out.println("Dice Value is ==> " +diceValue);
			int option = rand.nextInt(3);
			//check condition in switch
			DiceRollCount++;
			if(position == WINNING_POSITION) {
				System.out.println("<====YOU WON THE GAME====>");
			
			break;
			}
			switch(option) {
				case 0:
					System.out.println("#NO PLAY");
					break;
				case 1:
					System.out.println("#LADDER");
					position += diceValue;
					System.out.println("Current Position is ==>" + position);
					
					if(position > 100) { 
						position = position - diceValue;
					System.out.println("Current Position is ==>" + position);	
					}
					break;
				case 2:
					System.out.println("#SNAKE");
					position -= diceValue;
					System.out.println("Current Position is ==>" + position);
					
					if(position < 0) { 
						position = 0;
					System.out.println("Current Position is ==>" + position);	
					}
					break;
				default:
					System.out.println("NOT CORRECT");
			}
			System.out.println("Dice Roll Count ===>"+DiceRollCount);
	
		}
	
	}
}