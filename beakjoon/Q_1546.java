package beekjoon;

import java.util.Scanner;

public class Q_1546 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int[] list = new int[input];
		
		double avg = 0.0;
		int sum = 0;
		int max = 0;
		
		for(int i = 0; i < list.length; i++) {
			list[i] = sc.nextInt();
			if(max < list[i]) {
				max = list[i];
			}
			sum += list[i];
		}
		sc.close();
		
		avg = ((double) sum / (double) input) / (double) max;
		System.out.println(avg * 100.0);
	}
}
