//입력받은 정수를 매개변수로 받아, 해당 정수를 출력하는 메소드를 선언하고 호출해보세요


import java.util.Scanner;

public class 문제1_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int i = sc.nextByte();
        test(i);
    }
    public static void test(int a){
        System.out.println(a);
    }
}
