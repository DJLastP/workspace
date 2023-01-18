import java.util.Scanner;

public class 키보드입력03 {
    public static void main(String[] args) {
        //키보드로 두 정수를 입력받아
        //입력받은 두 수의 합이 10 이상이면
        //"10이상입니다"를 출력하는 프로그램
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        System.out.print("첫 번째 수 : ");
        num1 = sc.nextInt();
        System.out.print("두 번째 수 : ");
        num2 = sc.nextInt();

        if(num1 + num2 >= 10){
            System.out.println("10이상 입니다.");
        }
    }
}
