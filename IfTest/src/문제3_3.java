import java.util.Scanner;

public class 문제3_3 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("1~99사이의 수를 입력하세요 : ");
        a = sc.nextInt();

        if (a == 3 || a == 6 || a == 9) {     //a가 3.6.9 일때
            System.out.println("박수짝");
        } else if (a >= 10) {                                   //a가 10보다클때
            if (((a % 10) == 3 || (a % 10) == 6 || (a % 10) == 9) && ((a / 10) == 3 || (a / 10) == 6 || (a / 10) == 9)) {  //a를 1으로 나눈 나머지가 3.6.9와일치하는지 확인 (1의자리수)
                System.out.println("박수짝짝");
            } else if (((a % 10) == 3 || (a % 10) == 6 || (a % 10) == 9) || ((a / 10) == 3 || (a / 10) == 6 || (a / 10) == 9)) {  //a를 1으로 나눈 나머지가 3.6.9와일치하는지 확인 (1의자리수)
                System.out.println("박수짝");
            }
        }
    }
}