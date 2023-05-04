import java.util.Scanner;

public class MenuManager5 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	AccountManager accountManager = new AccountManager(input);
	int num = -1;

	while(num != 5) {
	System.out.println("1. Earning");
	System.out.println("2. Delete");
	System.out.println("3. Edit Accountbook");
	System.out.println("4. View Accountbook");
	System.out.println("5. Exit");
	System.out.print("Select one number between 1~5 : ");
	num = input.nextInt();

	if (num==1) {
	accountManager.earning();}
	else if (num==2) {
	accountManager.delete();}
	else if (num==3) { 
	accountManager.editAccountbook();}
	else if (num==4) {
	accountManager.viewAccountbooks();}
	else {
	continue;}
     	}
	}
}