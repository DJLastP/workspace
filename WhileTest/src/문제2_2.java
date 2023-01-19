//키보드로 두 정수를 입력받아 입력받은 두 정수 사이의 모든 저수의 합을 출력하라

import java.util.Scanner;

public class 문제2_2 {
    public static void main(String[] args) {
        int a = 0, b = 0;
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수 : ");
        a = sc.nextInt();
        System.out.print("두번째 정수 : ");
        b = sc.nextInt();
        boolean chk = a < b;

        if (chk == true) {

            while (a <= b) {
                cnt = a + cnt;
                a++;
            }
        }
        else if (chk == false) {
            while (b <= a) {
                cnt = b + cnt;
                b++;
            }

        }
        System.out.println(cnt);
    }
}
