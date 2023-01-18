import java.util.Scanner;

public class 문제4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "";
        System.out.print("성별을 입력하세요 : ");
        a = sc.next();
        if(a.equals("남")){
            System.out.println("남자입니다");
        }
        else if(a.equals("여")){
            System.out.println("여자입니다.");
        }
        else {
            System.out.println("다시 입력하세요");
        }



    }
}
