//정수형 배열을 매개변수로 받아 배열의 모든 요소를 출력하는 메소드를 만들고 호출하세요

public class 문제3_5 {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        test3_5(arr);
    }

    public static void test3_5(int arr[]){
        for (int i = 0 ; i < arr.length ; i ++){
            System.out.println(arr[i]);
        }


    }
}
