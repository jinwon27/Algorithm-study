package beekjoon;

import java.util.Scanner;

public class Q_2525 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(); 
		int B = sc.nextInt(); 
		int C = sc.nextInt(); 
		
		int sum = 60 * A + B;
		sum += C;
		
		int hour = (sum/60) % 24;
		int minute = sum % 60;
		
		System.out.println(hour + " " + minute);	
				
	}
}
