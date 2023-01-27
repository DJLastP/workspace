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

        if (cal.a.equals("+")){
            cal.getSum();;
        }
        else if (cal.a.equals("-")){
            cal.getMin();
        }
        else if (cal.a.equals("*")){
            cal.getMul();
        }
        else if (cal.a.equals("/")){
            cal.getDev();
        }
        else {
            System.out.println("연산자를 잘못입력");
        }



    }
}
