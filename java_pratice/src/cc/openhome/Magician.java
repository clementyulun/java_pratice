package cc.openhome;

public class Magician extends Role {
	@Override
	public void fight() {
		System.out.println("�ϥ��]�k����");
	}
	public void cure() {
		System.out.println("�v���N");
	}
	@Override
	public String toString() {
		return "�]�k�v : " + super.toString();
	}
	
}
