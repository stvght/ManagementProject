package Account;

import java.util.Scanner;

import exception.AmountFormatException;

public class Study extends Account{
	public Study(AccountKind kind) {
		super(kind);
	}
	public void getUserInput(Scanner input) { // 오버라이딩
		setAccountNumber(input);
		setAmountwithYN(input);
		setAccountDate(input);
	}

	public void setAmountwithYN(Scanner input) {
		char answer = 'X';
		while (answer != 'y'&&answer != 'Y'&&answer != 'n'&&answer != 'N') {
			System.out.print("수익이 있습니까? (Y/N)");
			answer = input.next().charAt(0);
			try {
				if(answer == 'Y' || answer == 'y') {
					setAccountAmount(input);
					setAccountContent(input);
					break;
				}
				else if (answer == 'N' || answer == 'n') {
					this.setAmount("");
					this.setContent("");
					break;
				}
				else {
				}
			}
			catch(AmountFormatException e) {
				System.out.println("Incorrect Amount Format. put the amount that contains '원'");

			}
		}
	}

	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind: " + skind + " number : "+number +" amount : "+amount +" "+ " content : "+content+" " + " date : "+date);
	}
}

