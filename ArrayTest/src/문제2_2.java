//길이가 100인 배열을 만들고 각 요소의 값을 1 ~ 100으로 변경하자. 그 후 배열에 들어간 수 중
//소수만 출력해보자. (소수란 1과 자기자신의 수로만 나누어떨어지는수이다.)

public class 문제2_2 {
    public static void main(String[] args) {
        int[] arr;
        int sum = 0;
        arr = new int[100];
        for(int i = 0; i < arr.length; i++){            //배열에 1~100 넣기
            arr[i] = i + 1;
        }

        for(int i = 1; i < arr.length; i++){        //소수인지 확인
            int cnt = 0;                            //나누어떨어지는 경우를 저장하는변수
            for(int j = 1; j < arr.length; j++) {      //배열의값을 1부터 배열의값까지 나눈다
                if (arr[i] % j == 0) {            // 배열값을 1부터 배열값까지 나눈 나머지가 0 일경우에
                    cnt++;                          //cnt 함수에 1을추가한다
                }
            }
            for(int e : arr)
                if (cnt == 2) {
                    System.out.print(" " + arr[i]);
                    ++sum;

                }

        }
        System.out.println(" ");
        System.out.println("소수는 " + sum + "개입니다.");

    }
}
