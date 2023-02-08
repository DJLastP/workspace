package test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c = 0;
        System.out.print("첫번째 정수 : ");
        a = sc.nextInt();
        System.out.print("두번째 정수 : ");
        b = sc.nextInt();
        System.out.print("두번째 정수 : ");
        c = sc.nextInt();

        if (a > b && a > c && b > c ){
            System.out.println(a + " > " + b + " > " + c );
        }
        if (a > b && a > c && c > b ){
            System.out.println(a + " > " + c + " > " + b );
        }
        if (b > a && b > c && a > c ){
            System.out.println(b + " > " + a + " > " + c );
        }
        if (b > a && b > c && c > a ){
            System.out.println(b + " > " + c + " > " + a );
        }
        if (c > a && c > b && a > b ){
            System.out.println(c + " > " + a + " > " + b );
        }
        if (c > a && c > b && b > a ){
            System.out.println(c + " > " + b + " > " + a );
        }

    }
}
