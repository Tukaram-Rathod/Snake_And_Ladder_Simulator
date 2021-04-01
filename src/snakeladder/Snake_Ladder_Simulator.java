package snakeladder;
import java.util.Random;
public class Snake_Ladder_Simulator {

	public static void main(String[] args) {
		int position = 0;
		final int WINNING_POSITION = 100;
		//using while loop
		while(position <= WINNING_POSITION) {	
			Random rand = new Random();
			int diceValue = rand.nextInt(6)+1;
			System.out.println("Dice Value is ==> " +diceValue);
			int option = rand.nextInt(3);
			
			if(option == 0) {
				System.out.println("#NO PLAY");
			}
			else if(option == 1) {
				System.out.println("#LADDER");
				position += diceValue;
				System.out.println("Current Position is ==>" + position);
			}
			else if(option == 2) {
				System.out.println("#SNAKE");
				position -= diceValue;
				System.out.println("Current Position is ==>" + position);	
				
				if(position < 0) {
						position = 0;
						System.out.println("Current Position is ==>" + position);	
				}
			}
		}
	}
}
