package cc.openhome;

class CashCard {
	private String number;
	private int balance;
	private int bonus;
	
	public String getNumber() {
		return number;
	}

	public int getBalance() {
		return balance;
	}

	public int getBonus() {
		return bonus;
	}

	CashCard(String number, int balance, int bonus){
		this.number = number;
		this.balance = balance;
		this.bonus = bonus;
	}
	
	void store(int money) {
		if(money > 0) {
			this.balance += money;
			if(money >= 1000) this.bonus++;
		}else {
			System.out.println("儲值金額不能為負數");
		}
	}
	
	void charge(int money) {
		if(money > 0) {
			if(money <= this.balance) {
				this.balance -= money;
			}else {
				System.out.println("餘額不足");
			}
		}else {
			System.out.println("扣款金額不能為負");
		}
	}
	
	int exchange(int bonus) {
		if(bonus > 0) {
			this.bonus -= bonus;
		}
		return this.bonus;
	}
}
