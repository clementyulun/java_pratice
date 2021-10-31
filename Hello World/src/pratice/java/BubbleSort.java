package pratice.java;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {4,5,10,23,5,2,23,5,2,1,5,3,7,6,63234,74,85};
		int temp = 0;
		for(int i = 0; i < arr.length - 2;  i++) {
			for(int j = 1; j < arr.length - i; j++) {
				if(arr[j] < arr[j-1]) {
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		System.out.print(Arrays.toString(arr));
	}

}
