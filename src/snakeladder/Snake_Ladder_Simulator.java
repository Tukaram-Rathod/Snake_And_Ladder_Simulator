package snakeladder;
import java.util.Random;
public class Snake_Ladder_Simulator {

	public static void main(String[] args) {
		int position = 0;
		Random rand = new Random();
		int diceValue = rand.nextInt(6)+1;
		System.out.println("Dice Value is ==> " +diceValue);
	}

}
