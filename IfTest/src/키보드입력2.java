import java.util.Scanner;

public class 키보드입력2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;

        System.out.print("이름 입력 :");
        name = sc.next();

        System.out.println("입력받은 이름 : " + name);
    }
}
