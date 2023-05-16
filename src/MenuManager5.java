import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		AccountManager accountManager = new AccountManager(input);
		selectMenu(input, accountManager);
	}

	public static void selectMenu(Scanner input, AccountManager accountManager) {
		int num = -1;
		while(num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					accountManager.earning();
					break;
				case 2:
					accountManager.delete();
					break;
				case 3:
					accountManager.editAccountbook();
					break;
				case 4:
					accountManager.viewAccountbooks();
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}

	public static void showMenu() {
		System.out.println("1. Earning");
		System.out.println("2. Delete");
		System.out.println("3. Edit Accountbook");
		System.out.println("4. View Accountbook");
		System.out.println("5. Exit");
		System.out.print("Select one number between 1~5 : ");
	}
}