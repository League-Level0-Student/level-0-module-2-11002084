package extra;

import javax.swing.JOptionPane;

public class RollerCoaster {
public static void main(String[] args) {
	String height=JOptionPane.showInputDialog("How many inches tall are you?");
	int height2=Integer.parseInt(height);
	if(height2>48) {
		JOptionPane.showMessageDialog(null, "You can go on the rollercoaster.");
	}else {JOptionPane.showMessageDialog(null, "GROW MORE!!!!!!!");
}
}
}

