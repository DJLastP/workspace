//출력문을 한번만 사용하여 0 ~ 5까지 출력하되, while문을 사용하여라

public class 문제1_3 {
    public static void main(String[] args) {
        int num = 0;

        while (num<5){
            num++;
            System.out.println(num);
        }
//for문을 사용하여라

        for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }

    }
}
