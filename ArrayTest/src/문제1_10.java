//정수를 5개 저장할 수 있는 배열을 만들고, scanner를 통해 입력받은 값을 하나씩
//배열의 요소에 저장해보자. 만약 키보드로 1 2 3 4 5를 입력했다면 배열의 요소에
//각각 1.2.3.4.5가 저장되어야 한다. 출력을 통해 결과를 확인해 보아라.

import java.util.Scanner;

public class 문제1_10 {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[5];
        Scanner sc = new Scanner((System.in));
        for(int i = 0; i < arr.length; i++){
            System.out.print((i + 1) + "번 숫자 입력 : ");
            arr[i] = sc.nextInt();
        }
        for(int e : arr){
            System.out.println(e);
        }
    }
}
