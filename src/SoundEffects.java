import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffects implements ActionListener {
	JButton button = new JButton();
	JButton button2 = new JButton();
public static void main(String[] args) {
	SoundEffects se = new SoundEffects();
	se.showButton();
}
public void showButton() {
	JFrame frame = new JFrame();
	frame.setVisible(true);
	JPanel panel = new JPanel();
	frame.add(panel);
	panel.add(button);
	panel.add(button2);
    button.setText("Button 1");
    button2.setText("Button 2");
    button.addActionListener(this);
    button2.addActionListener(this);
    frame.pack();
    
}
private void playSound(String fileName) {
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
    sound.play();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	if (buttonPressed.equals(button)) {
		playSound("ding.wav");
	}
	if (buttonPressed.equals(button2)) {
		playSound("ding 2.wav");
	}
	
}

}
