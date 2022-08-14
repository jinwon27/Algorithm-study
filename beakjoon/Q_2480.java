package beekjoon;

import java.util.Scanner;

public class Q_2480{
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner( System.in );
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        sc.close();
        
        if( num1 == num2 && num1 == num3 && num2 == num3 ) {
            System.out.print( 10000 + ( num1*1000 ) );
        } else if( num1 == num2 || num1 == num3 ) {
            System.out.print( 1000 + ( num1*100 ) );
        } else if( num2 == num3 ) {
            System.out.print( 1000 + ( num2*100 ) );
        } else {
            System.out.print( ( Math.max(num1, Math.max(num2, num3) ) *100 ) );
        }
    }
}