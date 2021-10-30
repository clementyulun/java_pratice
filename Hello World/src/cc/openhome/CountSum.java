package cc.openhome;

import java.util.Scanner;

public class CountSum {

	public static void main(String[] args) {
		var console = new Scanner(System.in);
		int sum = 0;
		int inputNumber = 0;
		do{
			System.out.print("輸入數字 : ");
			inputNumber = Integer.parseInt(console.nextLine());
			sum += inputNumber;
		}while(inputNumber != 0);
		System.out.printf("總和為 : %d", sum);
		console.close();
	}

}
