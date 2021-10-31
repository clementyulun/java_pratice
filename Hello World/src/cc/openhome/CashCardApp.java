package cc.openhome;

public class CashCardApp {

	public static void main(String[] args) {
		CashCard[] cards = {
				new CashCard("A001", 500, 0),
				new CashCard("A002", 300, 0),
				new CashCard("A003", 1000, 1)				
		};
		
		for(var card : cards) {
			System.out.printf("(%s, %d, %d)%n", card.getNumber(), card.getBalance(), card.getBonus());
		}
		
		cards[0].store(10000);
		cards[2].charge(200);
		
		for(var card : cards) {
			System.out.printf("(%s, %d, %d)%n", card.getNumber(), card.getBalance(), card.getBonus());
		}

	}

}
