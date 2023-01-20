//1,5,7을 초기값으로 저장하고 있는 배열을 만들고,
//배열의 모든 요소의 합을 출력해보아라.

public class 문제1_9 {
    public static void main(String[] args) {
        int[] arr = {1,5,7};
        int sum = 0;
        for(int e : arr){
            sum = e + sum;
        }
        System.out.println(sum);
    }
}
