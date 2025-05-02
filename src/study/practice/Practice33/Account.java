package study.practice.Practice33;

public class Account {
	private String owner;
	private long balance;
	Account(){
		owner=null;
		balance=0;
	}
	Account(String owner,long balance){
		this.owner=owner;
		this.balance=balance;
	}
	Account(String owner){
		this.owner=owner;
		balance=0;
	}
	Account(long balance){
		this.balance = balance;
		owner=null;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public long deposit(long amount) {
		balance= balance+amount;
		return amount;
	}
	public long withdraw(long amount) {
		if(amount<=balance)balance=  balance-amount;
		else System.out.println("잔액까지만 인출 가능!!");
		return amount;
	}

}
