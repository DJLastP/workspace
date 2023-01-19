//출력문을 한번만 사용하여 10~0까지 출력

public class 문제1_7 {
    public static void main(String[] args) {
        //while문 사용

        int num = 10;

        while (num >= 0){
            System.out.println(num);
            num--;

        }

        //for문 사용

        for(int i = 10; i >=0; i--){
            System.out.println(i);
        }
    }
}
