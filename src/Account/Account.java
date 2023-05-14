package Account;

import java.util.Scanner;

public abstract class Account {
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
		public abstract void printInfo();
}

