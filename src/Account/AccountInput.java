package Account;

import java.util.Scanner;

import exception.AmountFormatException;

public interface AccountInput {

	public int getNumber();

	public void setNumber(int number);

	public void setAmount(String amount) throws AmountFormatException;

	public void setContent(String content);

	public void setDate(String date);

	public void getUserInput(Scanner input);

	public void printInfo();

	public void setAccountNumber(Scanner input);

	public void setAccountAmount(Scanner input);

	public void setAccountContent(Scanner input);

	public void setAccountDate(Scanner input);
}
