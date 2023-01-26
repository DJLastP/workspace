//매개변수로 정수를 입력받아, 입력받은 정수를
//문자열로 리턴하는 메소드를 선언하고 사용

public class 문제2_6 {
    public static void main(String[] args) {
        System.out.println(test6(6));
    }

    public static String test6(int a){
        String b = ""+a;
        //문자열 -> 정수
        //int aa = Integer.parseInt("6");

        //정수   -> 문자열로
        //String bb = String.valueOf(10);


        return b;
    }
}
