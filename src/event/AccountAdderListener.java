package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import Account.AccountInput;
import Account.AccountKind;
import Account.Daily;
import Account.Study;
import exception.AmountFormatException;
import manager.AccountManager;

public class AccountAdderListener implements ActionListener{
	JTextField fieldNumber;
	JTextField fieldAmount;
	JTextField fieldContent;
	JTextField fieldDate;
	
	AccountManager accountManager;
	
	public AccountAdderListener(
			JTextField fieldNumber, 
			JTextField fieldAmount, 
			JTextField fieldContent,
			JTextField fieldDate, AccountManager accountManager) {
		this.fieldNumber = fieldNumber;
		this.fieldAmount = fieldAmount;
		this.fieldContent = fieldContent;
		this.fieldDate = fieldDate;
		this.accountManager =  accountManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		AccountInput account = new Daily(AccountKind.DAILY);
		try {
			account.setNumber(Integer.parseInt(fieldNumber.getText()));
			account.setAmount(fieldAmount.getText());
			account.setContent(fieldContent.getText());
			account.setDate(fieldDate.getText());
			accountManager.earning(account);
			putObject(accountManager, "accountmanager.ser");
			account.printInfo();
		} catch (AmountFormatException e1) {
			e1.printStackTrace();
		}
	}
	
	public static void putObject(AccountManager accountManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(accountManager);
			out.close();
			file.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
