//1~100까지의 숫자 중 5의 배수인 수를 모두 출력하고 5의 배수인 수의 개수도 출력하라

public class 문제1_13 {
    public static void main(String[] args) {
        //while문 사용

        int num = 1;
        int count1 = 0;

        while(num <= 100){
            if(num % 5 == 0){
                System.out.println(num);
                count1++;
            }
            num++;
        }
        System.out.println("1~100까지 숫자중 5의 배수의 수(while문) : " +count1);

        //for문 사용

        int count2 = 0;

        for(int i = 1; i <=100; i++){
            if(i % 5 == 0){
                System.out.println(i);
                count2++;
            }
        }
        System.out.println("1~100까지 숫자중 5의 배수의 수(for문) : " + count2);

    }
}
