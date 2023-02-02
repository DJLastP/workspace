public class String02 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        a1.num = 10;
        a2.num = 5;
        System.out.println(a1.num); //10
        System.out.println(a2.num); //5

        a1 = a2;

        System.out.println(a1.num); //5
        System.out.println(a2.num); //5

        a1.num = 10;
        a2.num = 20;

        System.out.println(a1.num); //10
        System.out.println(a2.num); //20


        //String은 다른 대부분의 참조변수와 다르게
        // imutable(이뮤터블) 변수이다.
        // imutable변수란 ? 값이 저장되면 변하지 않는 변수.
        String str1 = "java";
        String str2 = "java";

        str2 = "c++";

        System.out.println(str1);
        System.out.println(str2);

    }
}

class A{
    int num;
}