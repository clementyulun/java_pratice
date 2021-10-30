package pratice.java;

public class GCF {

	public static void main(String[] args) {
		int A = 1400;
		int B = 490; 
		if(A < B) {
			int temp = A;
			A = B;
			B = temp;
		}
		int rest;
		while(true) {
			rest = A % B;
			if (rest == 0) break;
			else {
				A = B;
				B = rest;				
			}
		}
		System.out.print(B);
	}
}
