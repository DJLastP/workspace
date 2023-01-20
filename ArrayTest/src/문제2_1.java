//scanner로 정수 하나를 입력받아, 입력받은 정수만큼의 길이를 갖는
//배열을 생성하고 배열에 각 요소에 1 ~ 입력 받은 정수로 값을 저장ㅎ판다.
//예를 들어 5를 입력했으면 길이가 5인 배열을 만들고 각 요소에 1,2,3,4,5가 들어가야한다.
//그 후 배열에 들어간 수의 편균을 출력해보자

import java.util.Scanner;

public class 문제2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");

        int a;
        int sum = 0;
        a = sc.nextInt();

        int[] arr;
        arr = new int[a];

        for(int i = 0; i < a; i++){
            arr[i] = i + 1;
            sum = sum + (i + 1);
        }

        System.out.println("들어간 수의 평균 : " + ((double)sum / a));
    }
}
