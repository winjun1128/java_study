package study.practice.Practice33;

public class AccountTest {

	public static void main(String[] args) {
		Account ac = new Account("한승준",100000);
		ac.deposit(10000);
		ac.withdraw(5000);
		System.out.printf("잔액은 : %d원입니다.\n",ac.getBalance());
		ac.withdraw(200000);
	}

}
