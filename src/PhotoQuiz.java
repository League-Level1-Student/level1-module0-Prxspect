/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
       String image="https://cdn5.littlethings.com/app/uploads/2016/06/embeddedIMG_sevenriddlethathavebeenbafflingtheinternet_850px_7-600x600.jpg";         
// 2. create a variable of type "Component" that will hold your image
Component image1;
		// 3. use the "createImage()" method below to initialize your Component
image1=createImage(image);
		// 4. add the image to the quiz window
quizWindow.add(image1);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String riddle= JOptionPane.showInputDialog("What is the answer to this riddle?");
		// 7. print "CORRECT" if the user gave the right answer
if (riddle.equals("your word")) {
	JOptionPane.showMessageDialog(null, "CORRECT");
}
		// 8. print "INCORRECT" if the answer is wrong
else {
	JOptionPane.showMessageDialog(null, "INCORRECT");
}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(image1);
		// 10. find another image and create it (might take more than one line of code)
String image2="https://cdn8.littlethings.com/app/uploads/2016/06/embeddedIMG_sevenriddlethathavebeenbafflingtheinternet_850px_5-600x600.jpg";
image1=createImage(image2);
		// 11. add the second image to the quiz window
quizWindow.add(image1);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String riddle2=JOptionPane.showInputDialog("What is the answer to this riddle?");
		// 14+ check answer, say if correct or incorrect, etc.
if (riddle2.equals("mirror")) {
	JOptionPane.showMessageDialog(null, "CORRECT"); 
	}
else {
	JOptionPane.showMessageDialog(null, "INCORRECT");
}
	}
	

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





