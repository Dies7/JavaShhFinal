package finalJava;
import javax.swing.JOptionPane;

import java.awt.Component;
import java.util.Random;

import javax.swing.*;
public class FlipACoin {

	public static void displayOutcome()
	{
		int moneyWagered = 0, totalMonies = 500;
		
		Random r = new Random();
		int computer = r.nextInt(2) + 1;
		String userAnswer= null;
		int answerInt;
		
		MoneyTotal.displayMyMoney(moneyWagered, totalMonies);
		
		userAnswer = JOptionPane.showInputDialog(null, "Choose \n1 for Heads\n2 for Tails");
		answerInt = Integer.parseInt(userAnswer);
		if(totalMonies > 0){
			if(answerInt == 1)
			{
				userAnswer = "Heads";
				if(computer == 1)
				{
					JOptionPane.showMessageDialog(null,  "You picked Heads. The coin landed on Heads.");
					MoneyTotal.addMoney(moneyWagered, totalMonies);
					
					
				}
				else if(computer  == 2)
				{
					JOptionPane.showMessageDialog(null,  "You picked Heads. The coin landed on Tails.");
					MoneyTotal.lostMoney(moneyWagered, totalMonies);
				}
			}
			if(answerInt == 2)
			{
				userAnswer = "Tails";
				if(computer == 2)
				{
					JOptionPane.showMessageDialog(null,  "You picked Tails. The coin landed on Tails.");
					MoneyTotal.addMoney(moneyWagered, totalMonies);
				}
				else if(computer  == 1)
				{
					JOptionPane.showMessageDialog(null,  "You picked Tails. The coin landed on Heads.");
					MoneyTotal.lostMoney(moneyWagered, totalMonies);
				}
			}
		}
		else {
			Component parentComponent = null;
			JOptionPane.showConfirmDialog(parentComponent, "You're Broke Like A Joke! " + totalMonies);
		}	
	}
}
