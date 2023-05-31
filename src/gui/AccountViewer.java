package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AccountViewer extends JFrame{
	public AccountViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("number");
		model.addColumn("amount");
		model.addColumn("content");
		model.addColumn("date");
	
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		this.setVisible(true);
	}
}
