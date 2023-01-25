//두 정수를 매개변수로 받아, 두 정수 모두가 짝수이면 '두 수는 짝수입니다.'를 출력
//한 정수만 짝수일 경우 '한 수만 짝수입니다'를, 두 수 모두 홀수잇대는 '두 수는 모두 홀수입니다.'
//를 출력하는 메소드를 선언하고 출력하세요

import java.util.Scanner;

public class 문제1_15 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 수 입력 : ");
        num1 = sc.nextInt();
        System.out.print("두번째 수 입력 : ");
        num2 = sc.nextInt();
        test15(num1,num2);
    }
    public static void test15(int num1,int num2){
        int a = (num1 % 2);
        int b = (num2 % 2);
        if(a == 0 && b == 0){
            System.out.println("두 수는 짝수입니다.");
        }

        else if (a == 0 || b == 0){
                System.out.println("한 수만 짝수입니다.");
        }
        else if (a !=0 && b != 0){
                System.out.println("두 수는 홀수입니다.");
        }
    }
}
