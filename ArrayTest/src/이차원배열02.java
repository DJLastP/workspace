public class 이차원배열02 {
    public static void main(String[] args) {

        //길이가 3인 2차원배열 생성
        int[][] arr = new int[3][];

        arr[0] = new int[3];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < 5; j++){
                arr[i] = new int[j];
            }
        }
    }
}
