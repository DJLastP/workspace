//scanner로 정수 두 개를 입력받아, 입력받은 두 수를 매개변수로 사용하여 두 수의 합을 출력하는
//메소드를 선언하고, 호출하여라

import java.util.Scanner;

public class 문제1_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.print("첫번째 숫자를 입력 : ");
        num1 = sc.nextInt();
        System.out.print("두번째 숫자를 입력 : ");
        num2 = sc.nextInt();
        test13(num1,num2);
    }
    public static void test13(int num1, int num2){
        System.out.println(num1 + num2);
    }
}
