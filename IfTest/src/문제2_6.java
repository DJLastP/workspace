import java.util.Scanner;

public class 문제2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.print("첫번째 수 : ");
        a = sc.nextInt();
        System.out.print("두번째 수 : ");
        b = sc.nextInt();
        System.out.print("세번째 수 : ");
        c = sc.nextInt();

        if(a > b && a > c && b > c){        // a > b > c
            System.out.println(a + " > " + b + " > " + c);
        }
        else if(a > c && a > b && c > b) {     //a > c > b
            System.out.println(a + " > " + c + " > " + b);
        }
        else if(b > a && b > c && a > c) {     //b > a > c
            System.out.println(b + " > " + a + " > " + c);
        }
        else if(b > c && b > a && c > a) {     //b > c > a
            System.out.println(b + " > " + c + " > " + a);
        }
        else if(c > a && c > b && a > c) {     //c > a > b
            System.out.println(c + " > " + a + " > " + b);
        }
        else if(c > b && c > a && b > a) {     //c > b > a
            System.out.println(c + " > " + a + " > " + b);
        }
    }
}
