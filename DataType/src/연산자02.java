import java.sql.SQLOutput;

public class 연산자02 {
    public static void main(String[] args) {
        int a = 5;

        //a변수에 값에 5를 더한 값을 a변수에 저장

        a += 5; // num1 = num1 + 5
        System.out.println(a);


        //대입연산자
        // =, +=, -=, *=, /=, %=
        int num1 = 10;
        num1 += 1;

        num1 *= 3; // num = num1 * 3
        num1 -= 5; // num1 = num1 - 5

        System.out.println(num1);
    }
}
