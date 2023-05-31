package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class AccountAdder extends JFrame{
	public AccountAdder() {
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
		panel.add(labelDate);
		panel.add(fieldDate);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setVisible(true);
	}
}
