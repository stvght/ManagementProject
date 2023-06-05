package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.AccountAdder;
import gui.AccountViewer;
import gui.WindowFrame;

public class ButtonEarningListener implements ActionListener{
	
	WindowFrame frame;
	
	public ButtonEarningListener(WindowFrame frame) {
		this.frame = frame;
	}
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		AccountAdder adder = frame.getAccountadder();
		frame.setupPanel(adder);
	}
}
