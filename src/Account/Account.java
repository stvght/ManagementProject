
public class Account {
		int number;
		int amount;
		String content;
		String date;
		public Account() {
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

		public void printInfo() {
		System.out.println("number : "+number +"amount : "+amount +" "+ "content : "+content+" " + "date : "+date);
		}
}

