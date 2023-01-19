import java.util.Scanner;

public class 문자열비교문제 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String gender = "";

        System.out.print("성별 입력 : ");
        gender = sc.next();

        //문법 : 비교할문자.equls(비교될문자)
        if(gender.equals("남")){
            System.out.println("남자임");
        }
        else if (gender.equals("여")){
            System.out.println("여자임");
        }
        else {
            System.out.println("다시 입력하세요");
        }
    }
}
