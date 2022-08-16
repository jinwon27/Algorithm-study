package beekjoon;

import java.util.Scanner;

public class Q_2884 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sang , min;
		
		sang = sc.nextInt();
		min = sc.nextInt();
		
		if(min < 45) {
				min += 15;
				if(sang == 0) {
					sang = 23;
					System.out.println(sang +" "+ min);
				}else {
					sang --;
					System.out.println(sang +" "+ min);
				}
		}
				else {
					min -= 45;
					System.out.println(sang +" "+ min);
				}
		}
}

