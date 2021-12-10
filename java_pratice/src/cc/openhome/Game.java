package cc.openhome;

public class Game {

	public static void main(String[] args) {
		var a = createSwordsMan();
		var b = createMagician();
		System.out.println(a);
		System.out.println(b);
		showBlood(a);
		showBlood(b);
		drawFight(a);
		drawFight(b);
	}
	static SwordsMan createSwordsMan() {
		var swordsMan = new SwordsMan();
		swordsMan.setName("Justin");
		swordsMan.setLevel(1);
		swordsMan.setBlood(200);
		return swordsMan;
	}
	static Magician createMagician() {
		var magician = new Magician();
		magician.setName("Monica");
		magician.setLevel(2);
		magician.setBlood(100);
		return magician;
	}
	static void showBlood(Role role) {
		System.out.printf("%s : ¦å¶q %d%n", role.getName(), role.getBlood());
	}
	static void drawFight(Role role) {
		System.out.print(role.getName());
		role.fight();
	}

}
