import javax.swing.JOptionPane;

public class GuessingGame {
	public static void main(String[] args) {
		//randomizes number
		int computerNum = (int) (Math.random() * 100) + 1;
		JOptionPane.showMessageDialog(null, computerNum);
		//input number
		int userNumber;
		
		int score = 0;
		do {
			String input = JOptionPane.showInputDialog(null,
					"Guess a number between 1 and 100 or enter -1 to quit.");
			userNumber = Integer.parseInt(input);
			score += 1;
			if (userNumber > computerNum -10 && userNumber < computerNum + 10 && userNumber != computerNum) {
				JOptionPane.showMessageDialog(null, "You are within 10 points.");
			} else if (userNumber > computerNum + 10) {
				JOptionPane.showMessageDialog(null, "Your guess is too high.");
			} else if (userNumber < computerNum - 10) {
				JOptionPane.showMessageDialog(null, "Your guess is too low.");
			}
		} while (userNumber != computerNum && userNumber != -1 && userNumber <= 100 && userNumber >= 0);
		
		/*if (userNumber > 100 || userNumber < 0 && userNumber != -1) {
			JOptionPane.showMessageDialog(null, "You have lost your chance of guessing by not following directions.");
		}
		*/
		if (userNumber == computerNum) {
			JOptionPane.showMessageDialog(null, "Correct! The number was " + computerNum + ". You took " + score + " guess/es.");
		} else if (userNumber ==-1) {
			JOptionPane.showMessageDialog(null, "You quit :(");
		}
		
	

			 
	
	}
}
	
	
		
	
	



	
