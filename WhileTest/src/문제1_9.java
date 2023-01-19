//while문을 사용하여 0 ~10 까지의 합을 구하여라

public class 문제1_9 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        while (a < 10) {
            a++;
            b = a + b;
        }
        System.out.println("while문결과 : " + b);


//for문 사용
        int c = 0;
        for (int i = 0; i <=10; i++) {
            c = i + c;
        }
        System.out.println("for문결과 : " + c);
    }
}
