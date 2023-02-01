import java.util.Scanner;

//주민등록번호의 7번재 자리 값으로 성별을 구분하는 프로그램.
//민번의 7번째 숫자가 1혹은 3이면 남자라고 출력
//7번째 숫자가 2 혹은 4이면 여자라고 출력
//scanner를 사용해서 민번의 7번째 자리를 입력받아
//문제를 해결

public class Switch04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        String a = "";
        System.out.print("주민등록번호 7번째 자리를 입력하세요 : ");
        num = sc.nextInt();
        switch (num){
            case 1, 3 :
                a = "남자입니다";
                break;
            case 2, 4 :
                a = "여자입니다.";
                break;
            default:
                a = "잘못입력하였습니다.";

        }
        System.out.println(a);
    }
}
