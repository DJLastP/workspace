//정수를 10개 저장할 수 있는 배열을 생성하고 각 요소에 1 ~ 10까지를 차례대로 넣어보라
//그리고 값이 잘 들어갔는지 확인해보라

public class 문제1_8 {
    public static void main(String[] args) {
        int[] arr1;
        arr1 = new int[10];
        for(int i = 0; i < 10; i++){
            arr1[i] = i + 1;
        }
        for(int e : arr1){
            System.out.println(e);
        }
    }
}
