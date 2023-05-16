package Account;

import java.util.Scanner;

public class Daily extends Account{
	public Daily(AccountKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setAccountNumber(input);
		setAccountAmount(input);
		setDetailContentwithYN(input);
		setAccountDate(input);
	}

	public void setDetailContentwithYN(Scanner input) {
		char answer = 'x';
		while(answer != 'y' &&answer != 'n' &&answer != 'Y' &&answer != 'N') {
			System.out.print("Do you have an detail content? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				setAccountContent(input);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				this.setContent("");
				break;
			}
			else {
			}
		}
	}

	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind: " + skind + " number : "+number +" amount : "+amount +" "+ "detail content : "+content+" " + " date : "+date);
	}
}
