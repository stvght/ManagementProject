import java.util.ArrayList;
import java.util.Scanner;

import Account.Account;
import Account.AccountInput;
import Account.AccountKind;
import Account.Daily;
import Account.Food;
import Account.Study;

public class AccountManager {
	ArrayList<AccountInput> accounts = new ArrayList<AccountInput>();
	Scanner input;
	AccountManager(Scanner input){
	this.input = input;
	}

	public void earning() {
	int kind = 0;
	AccountInput accountInput;
	while(kind != 1&&kind!=2&&kind!=3) {
	System.out.println("1 for Daily ");
	System.out.println("2 for Food ");
	System.out.println("3 for Study ");
	System.out.print("Select num for Account Kind between 1,2,3 : ");
	kind = input.nextInt();
	if(kind==1) {
		accountInput = new Daily(AccountKind.DAILY);
		accountInput.getUserInput(input);
		accounts.add(accountInput);
		break;
	}
	else if(kind==2) {
		accountInput = new Food(AccountKind.FOOD);
		accountInput.getUserInput(input);
		accounts.add(accountInput);
		break;
	}
	else if(kind==3) {
		accountInput = new Study(AccountKind.STUDY);
		accountInput.getUserInput(input);
		accounts.add(accountInput);
		break;
	}
	else {
		System.out.print("Select num for Account Kind between 1,2,3: ");
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
		AccountInput accountInput = accounts.get(i);
	if(accountInput.getNumber()==number) {
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
			accountInput.setAmount(amount);
		}
		else if (num==2) {
			System.out.print("수익 내용: ");
			String content = input.next();
			accountInput.setContent(content);
		}
		else if (num==3) {
			System.out.print("날짜: ");
			String date = input.next();
			accountInput.setDate(date);
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