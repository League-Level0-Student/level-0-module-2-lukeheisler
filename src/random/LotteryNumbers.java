package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	
	public static void main(String[] args) {
		int one = new Random().nextInt(100);
		int two = new Random().nextInt(100);
		int three = new Random().nextInt(100);
		int four = new Random().nextInt(100);
		int five = new Random().nextInt(100);
		
		JOptionPane.showMessageDialog(null, "Your Numbers are: " + one + ", " + two + ", " + three + ", " + four + ", and " + five + ".");
		
		int jackpot = new Random().nextInt(100);
		int prize1 = new Random().nextInt(100);
		int prize2 = new Random().nextInt(100);
		int prize3 = new Random().nextInt(100);
		
		JOptionPane.showMessageDialog(null, "The Winning Numbers are: " + prize1 + ", " + prize2 + ", and " + prize3 + ".");
		JOptionPane.showMessageDialog(null, "The Jackpot is: " + jackpot + ".");
		
		if(one==prize1 || one==prize2 || one == prize3) {
			JOptionPane.showMessageDialog(null, "Your first number matched!");
		}
		if(two==prize1 || two==prize2 || two == prize3) {
			JOptionPane.showMessageDialog(null, "Your second number matched!");
		}
		if(three==prize1 || three==prize2 || three == prize3) {
			JOptionPane.showMessageDialog(null, "Your third number matched!");
		}
		if(four==prize1 || four==prize2 || four == prize3) {
			JOptionPane.showMessageDialog(null, "Your fourth number matched!");
		}
		if(five==prize1 || five==prize2 || five == prize3) {
			JOptionPane.showMessageDialog(null, "Your first number matched!");
		}
		
		if(one==jackpot || two==jackpot || three==jackpot || four == jackpot || five == jackpot) {
			JOptionPane.showMessageDialog(null, "omg u just got the jackpot!!1!");
		}
		
		JOptionPane.showMessageDialog(null, "Thanks for playing!");
	}
	
}
