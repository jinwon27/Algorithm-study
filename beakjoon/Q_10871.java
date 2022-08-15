package beekjoon;

import java.util.Scanner;

public class Q_10871 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int x = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			int num2 = sc.nextInt();
				if(num2 < x) {
					System.out.print(num2+" ");
				}
		}
		
	}
}
