//1부터 누적해서 합을 구하다 300이 최초로 넘었을 때
// for문을 멈추고 그때까지의 합과 마지막으로 더해진 값을 각각 출력

public class 문제2_3 {
    public static void main(String[] args) {
        int cnt = 0;
        int num = 1;

        while(true){
            cnt = cnt + num;
            num++;

            if (cnt > 300){
                break;
            }

        }
        System.out.println("1부터 누적 합 : " + cnt);
        System.out.println("마지막 더한값 : " + num);
    }
}
