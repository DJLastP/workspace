import java.sql.SQLOutput;

public class 문제1_3 {
    public static void main(String[] args) {
        test1_3(10);
        printMaxNum(10,20);
    }

    //정수 하나를 매개변수로 받아, 그 값을 출력하는 메소드를
    //선언, 호출
    public static void test1_3(int i){
        System.out.println(i);
    }
    //매개변수로 두 정수를 받아, 두 수 중 큰수를 출력
    public static void printMaxNum(int num1,int num2){
        int max = 0;
        if(num1 > num2){
            max = num1;
        }
        else if (num1 < num2){
            max = num2;
        }
        System.out.println(max);
    }

}
