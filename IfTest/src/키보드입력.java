import java.util.Scanner;

public class 키보드입력 {
    public static void main(String[] args) {
        //키보드로 입력을 받을 수 있는 붓을 생성
        Scanner sc = new Scanner(System.in);
        int age;

        System.out.print("나이를 입력하세요 : ");
        age = sc.nextInt();

        System.out.println("입력받은 나이 : " + age);
    }
}
