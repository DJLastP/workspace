import java.util.Scanner;

public class 문제3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        System.out.print("점 x의 좌표를 입력하세요 : ");
        x = sc.nextInt();
        System.out.print("점 y의 좌표를 입력하세요 : ");
        y = sc.nextInt();
        if(x >=50 && y <= 100){
            System.out.println("사각형안에 점이 있습니다.");
        }
        else{
            System.out.println("사각형안에 점이 없습니다. ");
        }
    }
}
