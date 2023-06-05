package manager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Account.Account;
import Account.AccountInput;
import Account.AccountKind;
import Account.Daily;
import Account.Food;
import Account.Study;
import Account.Wear;

public class AccountManager implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3315605092441589012L;
	
	ArrayList<AccountInput> accounts = new ArrayList<AccountInput>();
	transient Scanner input;
	AccountManager(Scanner input){
		this.input = input;
	}

	public void earning() {
		int kind = 0;
		AccountInput accountInput;
		while(kind<1 || kind>4) {
			try {
				System.out.println("1 for Daily ");
				System.out.println("2 for Wear ");
				System.out.println("3 for Food ");
				System.out.println("4 for Study ");
				System.out.print("Select num for Account Kind between 1,2,3,4 : ");
				kind = input.nextInt();
				if(kind==1) {
					accountInput = new Daily(AccountKind.DAILY);
					accountInput.getUserInput(input);
					accounts.add(accountInput);
					break;
				}
				else if(kind==2) {
					accountInput = new Wear(AccountKind.WEAR);
					accountInput.getUserInput(input);
					accounts.add(accountInput);
					break;
				}
				else if(kind==3) {
					accountInput = new Food(AccountKind.FOOD);
					accountInput.getUserInput(input);
					accounts.add(accountInput);
					break;
				}
				else if(kind==4) {
					accountInput = new Study(AccountKind.STUDY);
					accountInput.getUserInput(input);
					accounts.add(accountInput);
					break;
				}
				else {
					System.out.print("Select num for Account Kind between 1,2,3,4: ");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 4!");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}

	public void delete() {
		System.out.print("번호 : ");
		int number = input.nextInt();
		int index = findIndex(number);
		removefromAccount(index, number);
	}
	public int findIndex(int number) {
		int index = -1;
		for(int i=0; i<accounts.size(); i++) {
			if(accounts.get(i).getNumber() == number) {
				index = i;
				break;
			}
		}
		return index;
	}

	public int removefromAccount(int index, int number) {
		if(index >= 0) {
			accounts.remove(index);
			System.out.println(number+"'s amount is deleted");
			return 1;
		}
		else {
			System.out.println("No money have been come");
			return -1;
		}
	}

	public void editAccountbook() {
		System.out.print("번호 : ");
		int number = input.nextInt();
		for(int i=0; i<accounts.size(); i++) {
			AccountInput account = accounts.get(i);
			if(account.getNumber()==number) {
				int num = -1;
				while(num != 4) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						account.setAccountAmount(input);
						break;
					case 2:
						account.setAccountContent(input);
						break;
					case 3:
						account.setAccountDate(input);
						break;
					default :
						continue;
					}
				}
				break;
			}
		}
	}
	public void viewAccountbooks() {
		for(int i=0; i<accounts.size(); i++) {
			accounts.get(i).printInfo();
		}
	}
	
	public int size() {
		return accounts.size();
	}
	
	public AccountInput get(int index) {
		return accounts.get(index);
	}

	public void showEditMenu() {
		System.out.println("** Accountbook Info Edit Menu **");
		System.out.println("1. Edit amount");
		System.out.println("2. Edit content");
		System.out.println("3. Edit date");
		System.out.println("4. Exit");
		System.out.print("Select one number between 1~4 : ");
	}
}