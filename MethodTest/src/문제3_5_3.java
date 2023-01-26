public class 문제3_5_3 {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
    for (int e : test(arr)) {
        System.out.println(e);
    }
    }

    //매개변수로 정수형 배열을 받아, 각 요소의 값에 +1한
    //배열을 리턴하는 메소드를 만드세요
    //ex 1,2,3 입력 - > 3,4,5 리턴
    public static int[] test(int arr[]){
        for (int i = 0; i < arr.length; i++){
            arr[i] = arr[i] + 1;
        }
        return arr;
    }

}

