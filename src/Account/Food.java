package Account;

import java.util.Scanner;

public class Food extends Account{
	public Food(AccountKind kind) {
		super(kind);
	}
	public void getUserInput(Scanner input) { // 오버라이딩
		System.out.print("번호 : ");
		int number = input.nextInt();
		this.setNumber(number);

		char answer = 'X';
		while (answer != 'y'&&answer != 'Y'&&answer != 'n'&&answer != 'N') {
		System.out.print("수익이 있습니까? (Y/N)");
		answer = input.next().charAt(0);
		if(answer == 'Y' || answer == 'y') {
		System.out.print("수익 : ");
		int amount = input.nextInt();
		this.setAmount(amount);
		System.out.print("수익 내용 : ");
		String content = input.next();
		this.setContent(content);
		break;
		}
		else if (answer == 'N' || answer == 'n') {
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
