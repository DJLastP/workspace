//두 정수를 매개변수로 받아, 두 정수의 나눗셈 몫과 나머지를 출력하는 메소드를 선언하고 호출해보세요

public class 문제1_7 {
    public static void main(String[] args) {
        test1_7(4,2);
    }
    public static void test1_7(int num1, int num2){
        System.out.println(num1 + "/" + num2 + " = " + (num1 / num2));
        System.out.println(num1 + "%" + num2 + " = " + (num1 % num2));
    }
}
