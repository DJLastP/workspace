//System.out.print("*")을 사용하여 별을 다섯 개 출력해보자 단 출력문은
//한번만 사용해야 한다 while문을 사용하여 풀어보아라

public class 문제1_1 {
    public static void main(String[] args) {
        int a = 0;
        while (a < 5){
            System.out.print("*");
            a++;
        }
//위 문제를 for문으로 풀어보아라

        for(int i = 0; i < 5; i++){
            System.out.print("*");
        }
    }
}
