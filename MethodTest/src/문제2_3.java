//두 정수를 매개변수로 받아, 두 정수 중 큰 숫자를 리터하는 메소드를 선언하고 사용해보세요

import java.util.Scanner;

public class 문제2_3 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 수 입력 : ");
        num1 = sc.nextInt();
        System.out.print("두 번째 수 입력 : ");
        num2 = sc.nextInt();
        System.out.println(max(num1,num2));
    }

    public static int max(int num1, int num2){
//        if(num1 > num2){
//            return num1;
//        }
//        else {
//            return num2;
//        }
        //     참또는 거짓을 판단할수 있는 조건 ? 참일 대의 값, 거짓일때의 값
        return num1 > num2 ? num1 : num2;
    }

    //삼항 연산자
}

