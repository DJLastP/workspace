//임의의 정수를 매개변수로 받아, 만약 매개변수로 받은 정수가 90 이상이면 'a', 70이상이면 'b'
//그 외의 수가 들어오면 'c'를 리턴하는 메소드를 선언하고 사용해보세요

import java.sql.SQLOutput;

public class 문제2_5 {
    public static void main(String[] args) {
        System.out.println(test5(60));
    }
    public static String test5(int a){
        if(a >= 90){
            return "A";
        } else if (a  >= 70) {
            return "B";
        }
        else {
            return "C";
        }
    }
}
