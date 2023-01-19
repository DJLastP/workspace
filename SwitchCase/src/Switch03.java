//점수에 대한 등급을 출력하는 프로그램을 완성.
//90 <= 점수 <= 100     -> a
//80 <= 점수 < 90       -> b
//70 <= 점수 < 80       -> c
//점수 < 70             -> d

//만족하는 값이 특정값이면 swtich문
//만족하는 값이 범위이면 if문이 더 편함

public class Switch03 {
    public static void main(String[] args) {
        int score = 89;
        String grade = "";
        switch (score/10){
            case 10 :
            case 9 :
                grade = "A";
                break;
            case 8 :
                grade = "B";
                break;
            case 7 :
                grade = "C";
                break;
            default:
                grade = "D";

        }
        System.out.println("등급 : " + grade);
    }
}
