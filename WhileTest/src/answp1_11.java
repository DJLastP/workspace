//1~100까지 숫자 중 3의 배수인 수의 개수를 구하여라

public class answp1_11 {
    public static void main(String[] args) {
        //while문 사용

        int num = 1;
        int count = 0;

        while (num < 101){
            if((num % 3) == 0){
                count++;
            }
            num++;
        }
        System.out.println("while문 결과 : " + count);

        //for문 사용

        int count2 = 0;

        for(int i = 1; i <101; i++){
            if(i % 3 == 0){
                count2++;
            }
        }
        System.out.println("for문 결과 : " + count2);
    }

}
