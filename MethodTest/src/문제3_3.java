//math.random() 메소드를 활용하여 1 ~ 50의 수 중 랜덤한 정수를 리턴하는 메소드를 만들고 호출해보자

public class 문제3_3 {
    public static void main(String[] args) {
        System.out.println(test());
    }

    public static int test(){
        int a;
        a = ((int)(Math.random()*50)+1);
        return a;
    }
}
