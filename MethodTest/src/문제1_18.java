//두 정수를 매개변수로 받아, 두 정수 사이의 5의 배수의 개수를 출력하는 매소드를 선언하고 호출해보세요

import java.util.Scanner;

public class 문제1_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("첫번째 숫자 입력 : ");
        num1 = sc.nextInt();
        System.out.print("두번째 숫자 입력 : ");
        num2 = sc.nextInt();
        test18(num1,num2);
    }

    public static void test18(int num1,int num2){
        int cnt = 0;
        for(int i = num1; i <= num2; i++){
            if(i % 5 == 0){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
