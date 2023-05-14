package Account;

import java.util.Scanner;

public interface AccountInput {

	public int getNumber();
	
	public void setAmount(int amount);
	
	public void setContent(String content);
	
	public void setDate(String date);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
}
