import java.util.Scanner;

public class MenuManager2 {

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
		
			switch(num) {
			case 1:
				System.out.print("수익 : ");
				int earning = input.nextInt();
				System.out.print("수익 내용 : ");
				String content = input.next();
				System.out.print("날짜 : ");
				String date = input.next();
				break;
			case 2:
				System.out.print("지출 : ");
				int expense = input.nextInt();
				System.out.print("지출 내용 : ");
				String content2 = input.next();
				System.out.print("날짜 : ");
				String date2 = input.next();
				break;
			case 3:
			case 4:
			case 5:
			}
		}
	}
}
