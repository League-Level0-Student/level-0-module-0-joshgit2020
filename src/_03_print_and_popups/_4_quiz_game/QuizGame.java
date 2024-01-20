package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
		String input = JOptionPane.showInputDialog("What is 1+1? ");
		
				// 3.  Use an if statement to check if their answer is correct
			if (input.equals("2")) { 
				score ++;
			} else {
				score--;
				
			}
			
		String input2 = JOptionPane.showInputDialog("What is 2+2? ");
			
			// 3.  Use an if statement to check if their answer is correct
		if (input2.equals("4")) { 
			score ++;
		} else {
			score--;
			
		}
		
		String input3 = JOptionPane.showInputDialog("What is 3+3? ");
		
		// 3.  Use an if statement to check if their answer is correct
		if (input3.equals("6")) { 
		score ++;
		} else {
		score--;
		
		}
		
		JOptionPane.showMessageDialog(null, "Your finals score is " + score);
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
