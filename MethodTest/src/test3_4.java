//정수 하나를 매개변수로 받아, 매개변수가 짝수면 true, 홀수면 false를 리턴하는 메소드를 만들어라

public class test3_4 {
    public static void main(String[] args) {
        System.out.println(test(2));
    }

    public static boolean test(int a){
        if(a % 2 == 0){
            return true;
        }
        else {
            return false;
        }
    }
}
