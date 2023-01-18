import java.util.Scanner;

public class 문제2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.print("국어점수를 입력하세요 : ");
        a = sc.nextInt();
        System.out.print("영어점수를 입력하세요 : ");
        b = sc.nextInt();
        System.out.print("수학점수를 입력하세요 : ");
        c = sc.nextInt();

        System.out.println("국어점수 : " + a);
        System.out.println("영어점수 : " + a);
        System.out.println("수학점수 : " + a);
        System.out.println("총점 : " + (a + b + c));
        System.out.println("평균 : " + ((double)a + (double)b + (double)c)/3);
    }
}
