import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("프로그램시작");

        try{

            System.out.print("숫자 입력 : ");
            int a = sc.nextInt();
            System.out.print("숫자 입력 : ");
            int b = sc.nextInt();
            System.out.println("a / b = " + (a/b));
        }
        catch (ArithmeticException e){
            //Exception e : 예외 발생에 대한 정보가 담기는 객체
            System.out.println("0으로 나누면 안되요");
        }
        catch (InputMismatchException e){
            System.out.println("입력값이 이상해요");
        }
        finally{
            //예외가 발생하든, 하지않든 무조건 실행되는 코드

        }
        System.out.println("프로그램 종료");
    }
}
