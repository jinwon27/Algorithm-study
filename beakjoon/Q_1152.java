package beekjoon;

import java.util.Scanner;

public class Q_1152 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//trim() ���ڿ� �¿� ���� ����
		String str = sc.nextLine().trim();
		
		// ���ڿ��� ��������� 0 ����ϱ�
		if(str.isEmpty())
			System.out.println("0");
		else
			System.out.println(str.split(" ").length);
	}
}
