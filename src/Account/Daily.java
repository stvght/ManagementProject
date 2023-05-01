package Account;

import java.util.Scanner;

public class Daily extends Account {
	public void getUserInput(Scanner input) {
		System.out.print("번호 : ");
		int number = input.nextInt();
		this.setNumber(number);
		System.out.print("수익 : ");
		int amount = input.nextInt();
		this.setAmount(amount);
		
		char answer = 'x';
		while(answer != 'y' &&answer != 'n' &&answer != 'Y' &&answer != 'N') {
		System.out.print("Do you have an content? (Y/N)");
		answer = input.next().charAt(0);
		if(answer == 'y' || answer == 'Y') {
			System.out.print("수익 내용 : ");
			String content = input.next();
			this.setContent(content);
			break;
		}
		else if(answer == 'n' || answer == 'N') {
			this.setContent("");
			break;
		}
		else {
			
		}
		}
		System.out.print("날짜 : ");
		String date = input.next();
		this.setDate(date);
	 }
}
