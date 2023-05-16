package Account;

import java.util.Scanner;

public class Food extends Necessities{
	public Food(AccountKind kind) {
		super(kind);
	}
	public void getUserInput(Scanner input) { // 오버라이딩
		setAccountNumber(input);
		setAmountwithYN(input);
		setAccountDate(input);
	}

	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind: " + skind + " number : "+number +" amount : "+amount +" "+ " content : "+content+" " + " date : "+date);
	}
}
