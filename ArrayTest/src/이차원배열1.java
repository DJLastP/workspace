public class 이차원배열1 {
    public static void main(String[] args) {
        //정수를 3개 저장할 수 있는 배열 arr 선언 및 생성
        int[] arr = new int[3];
        int x = 1;
        //이차원 배열 생성
        int[][] arr1 = new int[2][3];


        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = x++;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j]+" ");

            }
            System.out.println("");
        }

    }
}
