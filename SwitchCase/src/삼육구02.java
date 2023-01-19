import java.util.Scanner;

public class 삼육구02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("1~99사이의 정수를 입력하세요 : ");
        num = sc.nextInt();

        int tens = num / 10;  //십의자리수 확인
        int ones = num % 10;  //일의자리수 확인
        int count = 0;      //박수의 개수를 저장하기 위한 변수

        if (tens == 3 || tens == 6 || tens == 9) {      //십의 자리수에 3.6.9가 있는지 검사
            count++;
        }
        if (ones == 3 || ones == 6 || ones == 9) {       //일의 자리수에 3.6.9가 있는지 검사
            count++;
        }
        switch (count) {
            case 1:
                System.out.println("박수짝");
                break;
            case 2:
                System.out.println("박수짝짝");
        }
    }
}