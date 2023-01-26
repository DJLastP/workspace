import java.util.Scanner;
import java.util.function.DoubleUnaryOperator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int num1, num2;
        String a = "";
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 수 : " );
        cal.setNum1(sc.nextInt());
        System.out.print("두 번째 수 : " );
        cal.setNum2(sc.nextInt());
        System.out.print("연산자 : " );
        cal.setA(sc.next());

        if (cal.a == "+"){
            System.out.println(cal.sum());
            System.out.println(cal.num1 + " " + cal.a + " " + cal.num2 + " = " + cal.sum());
        }
        else if (cal.a == "-"){
            System.out.println(cal.num1 + " " + cal.a +" "+ cal.num2 + " = " + cal.min());
        }
        else if (cal.a == "*"){
            System.out.println(cal.num1 + " " + cal.a +" "+ cal.num2 + " = " + cal.mul());
        }
        else if (cal.a == "/"){
            System.out.println(cal.num1 + " " + cal.a +" "+ cal.num2 + " = " + cal.dev());
        }



    }
}
