//한 문자열과 정수를 매개변수로 받아, 매개변수로 받은 문자열을 매개변수로 받은 숫자만큼 출력하는
//메소드를 선언하고 호출해보세요

public class 문제1_19 {
    public static void main(String[] args) {
        int a = 1;
        String b = "A";
        test19(a,b);
    }

    public static void test19(int a,String b){
        for(int i = 0; i <= a; i++){
            System.out.println(b);
        }
    }
    public static void test19_1(String str, int num){
        String result = "";
        for(int i = 0; i < num ; i++){
            result += str;
        }
    }
}
