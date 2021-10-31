package practice.java;

import java.lang.Math;
import java.util.Arrays;

public class FindArmstrongNumber {

	public static void main(String[] args) {
		for(int i = 100; i < 999; i++) {
			int a = i / 100;
			int b = i / 10 - a * 10;
			int c = i % 10;
			if(Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3) == i)
				System.out.printf("%d%n", i);
		}
		int num = 10;
		var arr = new int[num];
		Arrays.fill(arr, 10);
		for(int content : arr) {
			System.out.printf("%3d",content);			
		}
	}

}
