public class array04 {
    public static void main(String[] args) {

        int[] arr1 = new int[5];
        arr1[0] = 10;

        //arr1 배열의 각 요소에
        //1부터 5까지 차례대로 저장하시오
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = i + 1;
        }

        //위의 문제 요구사항에 맞게 데이터가 잘 들어갔는지
        //배열의 모든 요소를 출력하여 확인하시오.
        for(int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }
        int b = 0;
        //for-each문
        for(int e : arr1){
            System.out.println(e);
        }

        double[] arr2 = {1.1, 2.2, 3.3,};

        for(double e : arr2){
            System.out.println(e);
        }

    }
}
