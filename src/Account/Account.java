package Account;

import java.util.Scanner;

import exception.AmountFormatException;

public abstract class Account implements AccountInput{
	protected AccountKind kind = AccountKind.DAILY;
	protected int number;
	protected String amount;
	protected String content;
	protected String date;
	public Account() {
	}
	public Account(AccountKind kind) {
		this.kind = kind;
	}
	public Account(String amount, String content) {
		this.amount = amount;
		this.content = content;
	}

	public Account(int number, String amount, String content, String date) {
		this.number = number;
		this.amount = amount;
		this.content = content;
		this.date = date;
	}

	public Account(AccountKind kind, int number, String amount, String content, String date) {
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
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) throws AmountFormatException{
		if(!amount.contains("원") && !amount.equals("")) {
			throw new AmountFormatException();
		}
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
	public abstract void printInfo();

	public void setAccountNumber(Scanner input) {
		System.out.print("번호: ");
		int number = input.nextInt();
		this.setNumber(number);
	}

	public void setAccountAmount(Scanner input) {
		String amount = "";
		while(!amount.contains("원")) {
			System.out.print("수익: ");
			amount = input.next();
			try {
				this.setAmount(amount);
			} catch (AmountFormatException e) {
				System.out.println("Incorrect Amount Format. put the amount that contains '원'");
			}
		}
	}

	public void setAccountContent(Scanner input) {
		System.out.print("수익 내용: ");
		String content = input.next();
		this.setContent(content);
	}

	public void setAccountDate(Scanner input) {
		System.out.print("날짜: ");
		String date = input.next();
		this.setDate(date);
	}

	public String getKindString() {
		String skind = "none";
		switch(this.kind) {
		case DAILY:
			skind = "Daily";
			break;
		case WEAR:
			skind = "Wear";
			break;
		case FOOD:
			skind = "Food";
			break;
		case STUDY:
			skind = "Study";
			break;
		default:
		}
		return skind;
	}
}

