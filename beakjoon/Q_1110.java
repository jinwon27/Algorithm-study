package beekjoon;

import java.util.Scanner;

public class Q_1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.close();
		
		int count = 0;
		int copy = N;
		
		while(true) {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			count ++;
			
			if(copy == N) {
				break;
			}
		}
		System.out.println(count);
	}
}