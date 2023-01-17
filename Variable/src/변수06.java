import javax.security.auth.Subject;

public class 변수06 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        System.out.print("값 변경 전 : ");
        System.out.println("num1 = " + num1 + ", num2 = " + num2);

        //여기에 문제를 해결하는 코드를 작성

        int x;
        x = num2;
        num2 = num1;
        num1 = x;

        System.out.print("값 변경 후 : ");
        System.out.println("num1 = " + num1 + ", num2 = " + num2);

    }

}
