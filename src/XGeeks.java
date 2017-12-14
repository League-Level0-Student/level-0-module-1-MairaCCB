
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
	public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
		String R = "flying";
		String N = "invisibility";
		String J = "walking on water";
		String I = "speed";

		// 2. Ask the user to enter a name. Store their answer in a variable.
		String name = JOptionPane.showInputDialog("What is your name?");
		// 3. Show the superpower in a pop-up, depending on the name entered.
		if (name.equals("Rocco")) {
			JOptionPane.showMessageDialog(null, "Rocco's superpower is " + R);
		}

		else if (name.equals("Nakita")) {
			JOptionPane.showMessageDialog(null, "Nakita's superpower is " + N);
		}

		else if (name.equals("John")) {
			JOptionPane.showMessageDialog(null, "John's superpower is " + J);
		}

		else if (name.equals("Isaac")) {
			JOptionPane.showMessageDialog(null, "Isaac's superpower is " + I);

		}

		else {
			JOptionPane.showMessageDialog(null, name + " your superpower is your awesome");
		}
}
}