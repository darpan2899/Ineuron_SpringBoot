import java.util.Random;
import java.util.Scanner;

class Guesser{
	int guessNumber;
	
	public int guessTheNumber() {
		
		Random random = new Random();
		guessNumber  = random.nextInt(101);
		return guessNumber;
		
	}
	
}

class Player{
	int playerGuessNumber;
	
	public int playerGuessTheNumber() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Players can guess a number between 0 to 100");
		System.out.print("Player:");
		playerGuessNumber = sc.nextInt();
		return playerGuessNumber;
		
	}
}

class Umpire{
	int numFromGuesser;
	int numFromPlayerA;
	int numFromPlayerB;
	int numFromPlayerC;
	
	public void collectNumFromGuesser() {
		Guesser guesser = new Guesser();
		numFromGuesser = guesser.guessTheNumber();
	}
	
	public void collectNumFromPlayer() {

		Player player = new Player();
		
		numFromPlayerA = player.playerGuessTheNumber();
		numFromPlayerB = player.playerGuessTheNumber();
		numFromPlayerC = player.playerGuessTheNumber();
	}
	
	public void compare() {
		
		boolean playerAWon = numFromPlayerA == numFromGuesser;
		boolean playerBWon = numFromPlayerB == numFromGuesser;
		boolean playerCWon = numFromPlayerC == numFromGuesser;
		boolean atleastOneWon = playerAWon || playerBWon || playerCWon;
		
	
		if(atleastOneWon) {
			
			System.out.println("Winners:");
			if(playerAWon) {
				System.out.println("Player A");
			}
			if(playerBWon) {
				System.out.println("Player B");
			}
			if(playerCWon) {
				System.out.println("Player C");
			}
		}
		else {
			System.out.println("None won the game");
			collectNumFromPlayer();
			compare();
			
		}
	}
}

public class LaunchGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Umpire umpire = new Umpire();
		umpire.collectNumFromGuesser();
		umpire.collectNumFromPlayer();
		umpire.compare();
		
		
		
		
		

	}

}
