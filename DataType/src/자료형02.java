public class 자료형02 {
    public static void main(String[] args) {
        //실수를 적으면(10.5)자바는 기본적으로 double형으로 인식
        float num3 = 10.5f;

        long num4= 10000000000L;

        //타입 변환
        //두 값의 데이터 타입이 다르면 값의 저장이 가능할 수도 아닐 수도 있다.

        //자동 타입 변환  - promotion
        int x1 = 10;
        double x2 = x1;
        System.out.println("x2 = " + x2);

        //강제 타입 변환 - casting
        double y1 = 10.5;
        int y2 = (int)y1;
        System.out.println(y2);

        double z = 50;
    }
}
