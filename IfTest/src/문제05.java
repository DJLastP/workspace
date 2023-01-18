import javax.swing.*;

public class 문제05 {
    public static void main(String[] args) {
        int a = 50;
        String grade = " ";

        if(a > 90 && a <=100){
            grade = "a";

        }
        else if(a >80 && a <= 90){
            grade = "b";

        }
        else if(a <= 80){
            grade = "c";

        }
        System.out.println("학점은" + grade + "입니다.");
    }
}
