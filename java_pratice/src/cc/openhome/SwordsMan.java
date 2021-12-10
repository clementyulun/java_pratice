package cc.openhome;

public class SwordsMan extends Role{
	@Override
	public void fight() {
		System.out.println("´§¼C§ðÀ»");
	}
	@Override
	public String toString() {
		return "¼C¤h : " + super.toString();
	}
	
}
