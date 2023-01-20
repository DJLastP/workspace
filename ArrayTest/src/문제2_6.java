//1,2,3을 초기값으로 갖는 배열 arr1과 4,5,6을 초기값으로 갖는 arr2를 만든다
//그 후 새로운 배열 newArr을 만들어 arr1과 arr2의 모든 값을 복사해 보자.
//복사 후 newArr은 1,2,3,4,5,6을 가져야한다.

public class 문제2_6 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] newArr;
        newArr = new int[arr1.length + arr2.length];
        for(int i = 0; i < arr1.length; i++){
            newArr[i] = arr1[i];
        }
        for(int i = 0; i < arr2.length; i++){
            newArr[i+arr1.length] = arr2[i];
        }
        for(int e : newArr) {
            System.out.println(e);
        }
    }
}
