package extra;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("How many years old are you?");
		int age2 = Integer.parseInt(age);
		if (age2 >= 18) {
			String president = JOptionPane.showInputDialog("Who should the next president be?");
			if (president.equals("Trump")) {
				JOptionPane.showMessageDialog(null, "YOU MONSTER!!!!!!!!!!!");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Nobody cares what you think.");
		}
	}
}
