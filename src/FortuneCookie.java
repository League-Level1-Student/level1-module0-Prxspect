import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FortuneCookie implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button;
	public static void main(String[] args) {
		 FortuneCookie fc = new FortuneCookie();
	     fc.showButton();
	}
	public void showButton() {
		JFrame frame=new JFrame();
	  frame.setVisible(true);
	  JPanel panel=new JPanel();
	  frame.add(panel);
	 	  JButton button=new JButton();
	   panel.add(button);
	   frame.pack();
	    button.addActionListener(this);
	   
	    


	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int rand= new Random().nextInt(5);
		// TODO Auto-generated method stub
		if (rand==0) {
	    	JOptionPane.showMessageDialog(null, "You will be a millionaire");
	    }
		else {
			JOptionPane.showMessageDialog(null, "No fortune");
		}
		
	}
	
}
