//math.random(); 이라는 메소드가 있다 이메소드는 0~1까지 사이의 실수 중 랜덤한
//수를 전달해준다. 예를 들어 double d = math.random();을 하면 0.0 <= d < 1 중
//임의의 실수 값이 d에 할당된다. 이를 활용하여 정수형 변수 I에 50 <= i <100 의 임의의 정수를 저장해보라.

public class 문제2_7 {
    public static void main(String[] args) {
        Math.random();
        double rand = Math.random();
        System.out.println(rand);

        //50 <= i <100 의 임의의 정수를 저장해보라.
        int result = (int)(Math.random() * 50 + 50);
        System.out.println(result);
    }
}
