import java.util.ArrayList;
import java.util.Scanner;

public class AccountManager {
	ArrayList<Account> accounts = new ArrayList<Account>();
	Scanner input;
	AccountManager(Scanner input){
	this.input = input;
	}

	public void earning() {
	Account account = new Account();
	System.out.print("번호 : ");
	account.number = input.nextInt();
	System.out.print("수익 : ");
	account.amount = input.nextInt();
	System.out.print("수익 내용 : ");
	account.content = input.next();
	System.out.print("날짜 : ");
	account.date = input.next();
	accounts.add(account);
	}

	public void delete() {
	System.out.print("번호 : ");
	int number = input.nextInt();
	int index = -1;
	for(int i=0; i<accounts.size(); i++) {
		if(accounts.get(i).number == number) {
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
	if(account.number==number) {
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
			account.amount = input.nextInt();
		}
		else if (num==2) {
			System.out.print("수익 내용: ");
			account.content = input.next();
		}
		else if (num==3) {
			System.out.print("날짜: ");
			account.date = input.next();
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

