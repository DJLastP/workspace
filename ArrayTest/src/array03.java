public class array03 {
    public static void main(String[] args) {

        //배열의 값 읽기
        int[] arr1 = {1, 2, 3};

        //배열의 내용을 출력할때에는 변수명으로 접근 x
        System.out.println(arr1);

        //배열에 저장된 값을 읽기 위해서는
        //배열의 몇번째 요소의 값을 읽을지 명확히 해야함.
        //arr1의 0번째 요소 출력
        System.out.println(arr1[0]);
        //System.out.println(arr1[3]);

        double[] arr2 = {1.0, 2.3, 3.6, 4.7, 5.5};

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        System.out.println();

        System.out.println("배열의 길이 : " + arr2.length);

    }
}
