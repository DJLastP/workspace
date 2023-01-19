import java.sql.SQLOutput;

public class Switch01 {
    public static void main(String[] args) {

        int num = 2;

        //switch case문의 소괄호안의 변수가
        //일치하는 case부터 코드를 해석.
        //break : break문이 실행되면 다음 코드를 진행X

        switch (num){
            case 1 :
                System.out.println(1);
                break;
            case 2 :
                System.out.println(2);
                break;
            case 3 :
                System.out.println(3);

        }
    }
}
