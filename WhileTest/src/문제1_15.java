//임의의 정수를 입력받아 0부터 입력받은 수까지 중 짝수의 개수를 구하여라

import java.util.Scanner;

public class 문제1_15 {
    public static void main(String[] args) {
        //while문 사용

        Scanner sc = new Scanner(System.in);
        int a = 1;
        int b = 0;              //입력받은 숫자
        int count1 = 0;
        System.out.print("숫자를 입력하세요 : ");
        b = sc.nextInt();

        while (a <= b) {
            if (a % 2 == 0) {
                count1++;
            }
            a++;
        }
        System.out.println("while문 결과 : 짝수는 " + count1 + "개 입니다.");

        //for문 사용

        int c = 0;
        System.out.print("숫자를 입력하세요 :");
        c = sc.nextInt();
        int count2 = 0;
        for (int i = 1; i <= c; i++) {
            if (i % 2 == 0) {
                count2++;
            }
        }
        System.out.println("for문 결과 : 짝수는 " + count2 + "개 입니다.");
    }
}