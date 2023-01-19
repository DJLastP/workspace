//구구단 2단을 아래와 같이 출력하세요. for문사용
//2 * 1 = 2
//2 * 2 = 4
//...
//2 * 9 = 18

import java.util.Scanner;

public class For04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b;
        System.out.print("구구단 몇단? : ");
        b = sc.nextInt();

        for(int i = 1; i <=9; i++){

            System.out.println(b + " * " + i + " = " + (b*i));
        }

        int num = 1;
        int result = 1;
        while(num < 10){
            result = num * 2;
            System.out.println("2 * "+ num + " = " + result);
            num++;
        }

    }
}
