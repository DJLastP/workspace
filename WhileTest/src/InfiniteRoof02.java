import java.util.Scanner;

public class InfiniteRoof02 {
    public static void main(String[] args) {
        //점수를 입력받는데
        //점수가 0 ~100 사이를 수를 받을 동안
        //계속해서 점수를 입력 받는 코드
        Scanner sc = new Scanner(System.in);
        int score = 0;

        while(true){

            System.out.print("점수 입력 : ");
            score = sc.nextInt();

                if(score <= 100 && score >= 0){
                    break;
                }
        }
    }
}
