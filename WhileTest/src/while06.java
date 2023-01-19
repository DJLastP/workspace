public class while06 {
    public static void main(String[] args) {

        //0부터 5까지의 합을 출력
        int a = 0;
        int b = 0;
        while(a < 6){
            b = (a + b);
            a++;

        }
        System.out.println(b);
    }
}
