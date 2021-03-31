package snakeladder;
import java.util.Random;
public class Snake_Ladder_Simulator {

	public static void main(String[] args) {
		int position = 0;
		Random rand = new Random();
		int diceValue = rand.nextInt(6)+1;
		System.out.println("Dice Value is ==> " +diceValue);
	
		int option = rand.nextInt(3);
		if(option == 0) {
			System.out.println("NO PLAY");
		}
		else if(option == 1) {
			System.out.println("LADDER");
			position += diceValue;
			System.out.println("Current Position is ==>" + position);
		}
		else {
			System.out.println("SNAKE");
			position -= diceValue;
			System.out.println("Current Position is ==>" + position);
		}
	}

}
