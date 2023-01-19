//출력문을 한번만 사용하여 "2 4 6 8 10"을 출력하되, while문을 사용하여라

public class 문제1_5 {
    public static void main(String[] args) {
        int num = 0;

        while(num < 10){
            num = num + 2;
            System.out.println(num);
        }

//for문 사용하여라

        for (int i = 1; i < 10; i++){
            i = i+1;
            System.out.println(i);
        }
    }
}
