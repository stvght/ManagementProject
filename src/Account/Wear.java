package Account;

import java.util.Scanner;

public class Wear extends Necessities{

	public Wear(AccountKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) { // 오버라이딩
		setAccountNumber(input);
		setAmountwithYN(input);
		setAccountDate(input);
	}
}
