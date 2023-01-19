import java.util.Scanner;

public class 문제4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;                            //입력받을 숫자
        String c = "";                      //연산자
        int d = 0;                          //결과값저장

        System.out.print("첫 번재 수 : ");
        a = sc.nextInt();
        System.out.print("두 번재 수 : ");
        b = sc.nextInt();
        System.out.print("연산자 : ");
        c = sc.next();


        //연산
        if( c.equals("+")){
            d = a + b;
        }
        else if( c.equals("-")){
            d = a - b;
        }
        else if( c.equals("*")){
            d = a * b;
        }
        else if( c.equals("/")){
            d = a / b;
        }

        //출력
        if (c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/")){
            System.out.println(a + c + b + " = " + d);
        }
        else {
            System.out.println("연산자를 잘못 입력하였습니다.");
        }

    }
}
