package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import event.AccountAdderCancelListener;
import event.AccountAdderListener;
import manager.AccountManager;

public class AccountAdder extends JPanel{
	
	WindowFrame frame;
	
	AccountManager accountManager;
	
	public AccountAdder(WindowFrame frame, AccountManager accountManager) {
		this.frame = frame;
		this.accountManager = accountManager;
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelNumber = new JLabel("번호: ", JLabel.TRAILING);
		JTextField fieldNumber = new JTextField(10);
		labelNumber.setLabelFor(fieldNumber);
		panel.add(labelNumber);
		panel.add(fieldNumber);
		
		JLabel labelAmount = new JLabel("수익: ", JLabel.TRAILING);
		JTextField fieldAmount = new JTextField(10);
		labelAmount.setLabelFor(fieldAmount);
		panel.add(labelAmount);
		panel.add(fieldAmount);
		
		JLabel labelContent = new JLabel("내용: ", JLabel.TRAILING);
		JTextField fieldContent = new JTextField(10);
		labelContent.setLabelFor(fieldContent);
		panel.add(labelContent);
		panel.add(fieldContent);
		
		JLabel labelDate = new JLabel("날짜: ", JLabel.TRAILING);
		JTextField fieldDate = new JTextField(10);
		labelDate.setLabelFor(fieldDate);
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new AccountAdderListener(fieldNumber,fieldAmount,fieldContent,fieldDate, accountManager));
		
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new AccountAdderCancelListener(frame));
		
		panel.add(labelDate);
		panel.add(fieldDate);
		
		panel.add(saveButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.add(panel);
		this.setVisible(true);
	}
}
