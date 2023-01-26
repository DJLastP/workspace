public class CarTest2 {
    public static void main(String[] args) {
        //car1, car2라는 car 클래스에 대한
        //객체 두 개를 생성.

        Car car1 = new Car();
        Car car2 = new Car();

        car1.brand = "현대";
        System.out.println(car2.brand);

    }
}
