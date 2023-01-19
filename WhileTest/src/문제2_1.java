//1이상 100미만의 정수 중에서 7의 배수와 9의 배수를 출력하는 프로그램을 작성하라
//단 7의 배수이면서 동시에 9의 배수인 수는 한 번만 출력하여야한다.

public class 문제2_1 {
    public static void main(String[] args) {
       //int count = 0;
        for(int i = 1; i <100; i++){
            if((i % 7) == 0){
                System.out.println(i);
            } else if ((i % 9) == 0) {
                System.out.println(i);
            }
        }
    }
}
