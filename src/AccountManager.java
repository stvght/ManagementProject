import java.util.ArrayList;
import java.util.Scanner;

import Account.Account;
import Account.Daily;

public class AccountManager {
	ArrayList<Account> accounts = new ArrayList<Account>();
	Scanner input;
	AccountManager(Scanner input){
	this.input = input;
	}

	public void earning() {
	int kind = 0;
	Account account;
	while(kind != 1&&kind!=2) {
	System.out.print("1 for Daily");
	System.out.print("2 for Food");
	System.out.print("Select num for Account Kind between 1 and 2: ");
	kind = input.nextInt();
	if(kind==1) {
		account = new Account();
		account.getUserInput(input);
		accounts.add(account);
		break;
	}
	else if(kind==2) {
		account = new Daily();
		account.getUserInput(input);
		accounts.add(account);
		break;
	}
	else {
		System.out.print("Select num for Account Kind between 1 and 2: ");
	}
		}
	
	}

	public void delete() {
	System.out.print("번호 : ");
	int number = input.nextInt();
	int index = -1;
	for(int i=0; i<accounts.size(); i++) {
		if(accounts.get(i).getNumber() == number) {
			index = i;
			break;
			}
	}
	if(index >= 0) {
		accounts.remove(index);
		System.out.println(number+"'s amount is deleted");
	}
	else {
		System.out.println("No money have been come");
		return;
	}
}

	public void editAccountbook() {
	System.out.print("번호 : ");
	int number = input.nextInt();
	for(int i=0; i<accounts.size(); i++) {
		Account account = accounts.get(i);
	if(account.getNumber()==number) {
		int num = -1;
		while(num != 4) {
		System.out.println("** Accountbook Info Edit Menu **");
		System.out.println("1. Edit amount");
		System.out.println("2. Edit content");
		System.out.println("3. Edit date");
		System.out.println("4. Exit");
		System.out.print("Select one number between 1~4 : ");
		num = input.nextInt();
		if (num==1) {
			System.out.print("수익: ");
			int amount = input.nextInt();
			account.setAmount(amount);
		}
		else if (num==2) {
			System.out.print("수익 내용: ");
			String content = input.next();
			account.setContent(content);
		}
		else if (num==3) {
			System.out.print("날짜: ");
			String date = input.next();
			account.setDate(date);
		}
		else {
		continue;
		} 	
	  }
		break;
	}
  }
}
	public void viewAccountbooks() {
//	System.out.print("수익 : ");
//	int amount = input.nextInt();
	for(int i=0; i<accounts.size(); i++) {
		accounts.get(i).printInfo();}
	}

}