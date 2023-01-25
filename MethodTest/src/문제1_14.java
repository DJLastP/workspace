//한 정수를 매개변수로 받아 그 정수가 짝수이면 짝수입니다.
//홀수이면 홀수입니다를 출력하는 메소드를 선언하고 호출해보세요

import java.util.Scanner;

public class 문제1_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("숫자를 입력하세요 : ");
        num = sc.nextInt();
        test(num);
    }
    public static void test(int num){
        if (num % 2 == 0 ){
            System.out.println("짝수입니다.");
        }
        else {
            System.out.println("홀수입니다.");
        }
    }

}
