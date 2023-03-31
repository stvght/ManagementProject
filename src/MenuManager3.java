import java.util.Scanner;

public class MenuManager3 {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while(num != 6) {
			System.out.println("1. Earning");
			System.out.println("2. Expense");
			System.out.println("3. Edit Accountbook");
			System.out.println("4. View Accountbook");
			System.out.println("5. Show a Menu");
			System.out.println("6. Exit");
			System.out.print("Select one number between 1~6 : ");
			num = input.nextInt();
			if (num==1) {
				earning();
			}
			else if (num==2) {
				expense();
			}
			else if (num==3) {
				editAccountbook();
			}
			else if (num==4) {
				viewAccountbook();
			}
			else {
				continue;
			}
		}
	}
		
	public static void earning() {
		Scanner input = new Scanner(System.in);
		System.out.print("수익 : ");
		int earn = input.nextInt();
		System.out.print("수익 내용 : ");
		String content = input.next();
		System.out.print("날짜 : ");
		String date = input.next();
	}
	public static void expense() {
		Scanner input = new Scanner(System.in);
		System.out.print("지출 : ");
		int spending = input.nextInt();
		System.out.print("지출 내용 : ");
		String content2 = input.next();
		System.out.print("날짜 : ");
		String date2 = input.next();
	}
	public static void editAccountbook() {
		Scanner input = new Scanner(System.in);
		System.out.print("수익 : ");
		int earn = input.nextInt();
	}
	public static void viewAccountbook() {
		Scanner input = new Scanner(System.in);
		System.out.print("수익 : ");
		int earn = input.nextInt();
	}
}