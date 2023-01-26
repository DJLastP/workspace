//한 정수를 매개변수로 받아 그 정수가 짝수이면 짝수입니다.
//홀수이면 홀수입니다를 출력하는 메소드를 선언하고 호출해보세요

import java.sql.SQLOutput;
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
        String a = num %2 == 0 ? "짝수" : "홀수";
            System.out.println(a + "입니다.");
    }
    //삼항연산자
    //조건 ? 참일때 값 : 거짓일때;
}
