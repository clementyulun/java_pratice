package cc.openhome;

public class Magician extends Role {
	@Override
	public void fight() {
		System.out.println("使用魔法攻擊");
	}
	public void cure() {
		System.out.println("治療術");
	}
	@Override
	public String toString() {
		return "魔法師 : " + super.toString();
	}
	
}
