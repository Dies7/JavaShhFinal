package finalJava;

import javax.swing.JOptionPane;

public class DisplayFlipAcoin {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
final int HEADS= 1;
final int TAILS = 5;
		int random;
		int guess;
		boolean isMatch;
		String guessString;
		
		random = HEADS + (int)(Math.random() * HEADS);
		
		guessString = JOptionPane.showInputDialog(null, " Guess which side the coin will land " + HEADS + " or " +
		TAILS, "random guess",JOptionPane.INFORMATION_MESSAGE);
		
		guess = Integer.parseInt(guessString);
		isMatch = guess == random;
		
		JOptionPane.showMessageDialog(null, "Your guess was " + (random-guess) + " number away from the random number.");
		JOptionPane.showMessageDialog(null, "The number was " + random + ". The result is " + isMatch + ".");
		
		
		
		
		
		
	}

}
