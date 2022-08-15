package beekjoon;

import java.util.Scanner;

public class Q_1152 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//trim() 문자열 좌우 공백 제거
		String str = sc.nextLine().trim();
		
		// 문자열이 비어있으면 0 출력하기
		if(str.isEmpty())
			System.out.println("0");
		else
			System.out.println(str.split(" ").length);
	}
}
