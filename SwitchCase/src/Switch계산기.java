import java.util.Scanner;

public class Switch계산기 {
    public static void main(String[] args) {
        int num1, num2, num3;
        num2 = 0;
        num3 = 0;
        String a = "";
        Scanner sc = new Scanner(System.in);


        System.out.print("첫번째 수 : ");
        num1 = sc.nextInt();
        System.out.print("두번째 수 : ");
        num2 = sc.nextInt();
        System.out.print("연산자 : ");
        a = sc.next();
        switch (a){
            case "+" :
                num3 = num1 + num2;
                break;
            case "-" :
                num3 = num1 - num2;
                break;
            case "*" :
                num3 = num1 * num2;
                break;
            case "/" :
                num3 = num1 / num2;
        }
        if (a.equals("+") || a.equals("-") || a.equals("*") || a.equals("/")){
            System.out.println(num1 +  a  + num2 + " = " + num3);
        }
        else {
            System.out.println("잘못된 연산자입니다.");
        }

    }
}
