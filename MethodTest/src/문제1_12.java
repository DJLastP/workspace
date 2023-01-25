//10번 문제에서 매개변수로 받는 나이 이름 주소를 scanner를 통한 입력으로 바꾸어 풀어보세요

import java.io.PushbackInputStream;
import java.util.Scanner;

public class 문제1_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        String name, add;
        System.out.print("이름을 입력하세요 : ");
        name = sc.next();
        System.out.print("나이을 입력하세요 : ");
        age = sc.nextInt();
        System.out.print("주소을 입력하세요 : ");
        add = sc.next();
        test12(name,age,add);
    }

    public static void test12(String name, int age, String add){
        System.out.println("이름은 " + name + " 입니다");
        System.out.println("나이는 " + age + " 입니다");
        System.out.println("주소는 " + add + " 입니다");
    }
}
