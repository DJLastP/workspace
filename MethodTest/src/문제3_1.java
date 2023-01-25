//정수 하나를 매개변수로 받아 해당 정수의 구구단을 출력하는 메소드를 만들고 호출해보세요

import java.util.Scanner;

public class 문제3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("구구단 몇단? : ");
        a = sc.nextInt();
        test(a);
    }

    public static void test(int a){
        System.out.println("구구단 " + a + "단");
        for (int i = 1; i < 10; i++){
            System.out.println(a + " * " + i + " = " + a*i);
        }
    }
}
