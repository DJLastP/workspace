//scanner로 입력받은 두 정수를 매개변수로 받아, 두 정수의 곱을 리턴하는 메소드를 선언하고
//호출하여 결과를 확인해보세요

import java.util.Scanner;

public class 문제2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.print("첫번째 숫자 입력 : ");
        num1 = sc.nextInt();
        System.out.print("두번째 숫자 입력 : ");
        num2 = sc.nextInt();
        System.out.println(test2(num1,num2));
    }

    public static int test2(int num1,int num2){
        return num1*num2;
    }
}
