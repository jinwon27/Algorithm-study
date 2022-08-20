package beekjoon;

import java.util.Scanner;

public class Q_8393 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int hap = 0;
		
		for(int i = 0; i <= num; i++) {
			hap += i;
		}
		
		System.out.println(hap);
 } 
}
