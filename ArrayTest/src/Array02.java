public class Array02 {
    public static void main(String[] args) {
        //배열의 또 다른 생성 방법 (실무에서는 잘 안쓰임)
        //1,2,3을 저장하고 있는 배열 arr1 생성
        int[] arr = {1, 2, 3};

        //특정 값으로 초기화된 배열을 생성할 때에는
        //선언과 생성을 같이 진행해야 함.
        int[] arr1;
        //   arr = {1, 2, 3};   <-- 안됨

        //1.5 2.5, 3.8을 초기 값으로 갖는 배열 arr2를 생성
        double[] arr2 = {1.5, 2.5, 3.8};

        //"java", "c++", "python"을 초기값으로 갖는 배열 arr3를 생성
        String[] arr3 = {"java", "c++", "python"};

    }
}
