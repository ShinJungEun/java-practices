package prob5;

public class Account {
	private String accountNo;
	private int balance;
	
	public Account(String accountNo) {
		setAccountNo(accountNo);
		setBalance();
		System.out.println(this.accountNo + " 계좌가 개설되었습니다.");
	}
	
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance() {
		this.balance = 0;
	}

	public void save(int n) {
		this.balance += n;
		System.out.println(this.accountNo + " 계좌에 " + n + "만원이 입금되었습니다.");
	}
	
	public void deposit(int n) {
		this.balance -= n;
		System.out.println(this.accountNo + " 계좌에 " + n + "만원이 출금되었습니다.");
	}
}