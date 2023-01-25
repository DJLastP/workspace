//한 정수를 매개변수로 받아, 0부터 입력받은 숫자까지 출력하는
//메소드를 선언하고 호출하세요

import java.util.Scanner;

public class 문제1_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("숫자를 입력하세요 : ");
        num = sc.nextInt();
        test16(num);
    }

    public static void test16(int num){
        for(int i = 0; i <= num; i++){
            System.out.print(i);

        }
    }
}
