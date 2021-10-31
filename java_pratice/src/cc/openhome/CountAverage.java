package cc.openhome;

public class CountAverage {

	public static void main(String[] args) {
		int sum = 0;
		for(String arg : args) {
			sum += Integer.parseInt(arg);
		}
		System.out.printf("平均為 : %.3f", (float)sum / args.length);

	}

}
