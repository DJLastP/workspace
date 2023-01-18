import java.util.Scanner;

public class 문제3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;

        System.out.print("첫번째 숫자를 입력하세요 : ");
        a = sc.nextInt();
        System.out.print("두번째 숫자를 입력하세요 : ");
        b = sc.nextInt();
        System.out.print("세번째 숫자를 입력하세요 : ");
        c = sc.nextInt();

        if(a + b > c || a + c > b || c + b > a){
            System.out.println("가능");
        }
        else {
            System.out.println("불가능");
        }
    }
}
