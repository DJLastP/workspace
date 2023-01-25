//한 정수를 매개변수로 받아, 1부터 매개변수로 받은 수까지 중 홀수의 합을 리턴하는 메소드를 선언하고 사용

public class 문제2_9 {
    public static void main(String[] args) {
        System.out.println(test9(5));
    }
    public static int test9(int num){
        int result = 0;
        for(int i = 0; i <= num; i++){
        if(i % 2 != 0){
            result = result + i;
        }
        }
        return result;
    }
}
