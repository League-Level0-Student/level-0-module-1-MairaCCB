import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {
String answer1= "coin";
String answer3= "towel";
		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer = JOptionPane.showInputDialog("What has a head and a tail, but not a body?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(answer.equals(answer1)) {
	JOptionPane.showMessageDialog(null, "correct!");
score +=1;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "Wrong, the correct answer is coin.");
}
		// 6. Add some more riddles
String answer2 = JOptionPane.showInputDialog("What gets wetter and wetter the more it dries?");
if(answer2.equals(answer3)) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score +=1;
}else {
JOptionPane.showMessageDialog(null, "Wrong, the answer is towel.");
}


		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your score is " + score);
	}
}

