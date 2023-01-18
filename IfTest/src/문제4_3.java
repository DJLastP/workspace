import java.util.Scanner;

public class 문제4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,d;
        String c = "";
        System.out.print("첫 번재 수 : ");
        a = sc.nextInt();
        System.out.print("두 번재 수 : ");
        b = sc.nextInt();
        System.out.print("연산자 : ");
        c = sc.next();

        if( c.equals("+")){
            d = a + b;
            System.out.println(a + " + " +  b + " = " + d);
        }
        else if( c.equals("-")){
            d = a - b;
            System.out.println(a + " - " + b + " = " + d);
        }
        else if( c.equals("*")){
            d = a * b;
            System.out.println(a + " * " + b + " = " + d);
        }
        else if( c.equals("/")){
            d = a / b;
            System.out.println(a + " / " + b + " = " + d);
        }
        else {
            System.out.println("연산자를 잘못 입력하였습니다.");
        }

    }
}
