package Account;

import java.util.Scanner;

public class Account {
	protected AccountKind kind = AccountKind.DAILY;
	protected int number;
	protected int amount;
	protected String content;
	protected String date;
		public Account() {
		}
		public Account(AccountKind kind) {
			this.kind = kind;
		}
		public Account(int amount, String content) {
		this.amount = amount;
		this.content = content;
		}

		public Account(int number, int amount, String content, String date) {
			this.number = number;
			this.amount = amount;
			this.content = content;
			this.date = date;
			}
		
		public Account(AccountKind kind, int number, int amount, String content, String date) {
		this.kind = kind;
		this.number = number;
		this.amount = amount;
		this.content = content;
		this.date = date;
		}

		public AccountKind getKind() {
			return kind;
		}
		public void setKind(AccountKind kind) {
			this.kind = kind;
		}
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		public int getAmount() {
			return amount;
		}
		public void setAmount(int amount) {
			this.amount = amount;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public void printInfo() {
			String skind = "none";
			switch(this.kind) {
			case DAILY:
				skind = "Daily";
				break;
			case FOOD:
				skind = "Food";
				break;
			case STUDY:
				skind = "Study";
				break;
			default:
			}
		System.out.println("kind: " + skind + " number : "+number +" amount : "+amount +" "+ " content : "+content+" " + " date : "+date);
		}
		
		public void getUserInput(Scanner input) {
			System.out.print("번호 : ");
			int number = input.nextInt();
			this.setNumber(number);
			System.out.print("수익 : ");
			int amount = input.nextInt();
			this.setAmount(amount);
			System.out.print("수익 내용 : ");
			String content = input.next();
			this.setContent(content);
			System.out.print("날짜 : ");
			String date = input.next();
			this.setDate(date);
		 }
}

