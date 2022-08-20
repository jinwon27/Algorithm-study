package beekjoon;

import java.util.Scanner;

public class Q_3003 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int csp[] = {1, 1, 2, 2, 2, 8};
		
		int input[] = new int[6]; // 입력값 비교하기
		
		for(int i=0; i<input.length; i++) {
			input[i] = sc.nextInt();
			System.out.print(csp[i] - input[i] + "");
		}
	}
}
