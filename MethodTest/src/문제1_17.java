//두 정수를 매개변수로 받아 두 정수 사이의 모든 숫자를 출력하는 메소드를 선언하고 호출해보세요

import java.util.Scanner;

public class 문제1_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("첫번째 숫자 입력 : ");
        num1 = sc.nextInt();
        System.out.print("두번째 숫자 입력 : ");
        num2 = sc.nextInt();
        test17(num1,num2);
    }

    public static void test17(int num1, int num2){
        int fromNum = num1 >= num2 ? num2: num1;
        int toNum = num1 >= num2 ? num1: num2;
        for(int i = fromNum; i <= toNum; i++){
            System.out.print(i+ " ");
        }
    }
}
