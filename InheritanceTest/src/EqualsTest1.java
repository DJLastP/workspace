public class EqualsTest1 {

    public static void main(String[] args) {
        //String 클래스 객체의 equals() 메소드
        //String 클래스의 equals() 메소드는
        //String 클래스가 별도로 만든 메소드가 아니라
        //Object 클래스에서 선언된 equals() 메소드를
        //오버라이딩 하여 문자열을 비교할 수 있도록
        //기능을 재정의 한거임!!
        String name = "java";
        name.equals("c++");


        Equals1 e1 = new Equals1("홍길동",20);
        Equals1 e2 = new Equals1("홍길동",25);

        //euals()는 객체와 매개변수로 들어온 데이터가
        //같은지 비교하여 참, 거짓값으로 리턴해주는 기능
        //비교의 기준은 클래스마다 다르기때문에
        //개발자가 equals() 메소드를 오버라이딩해서
        //비교의 기준을 코드로 구현해야 함
        boolean result = e1.equals(e2);
        System.out.println(result);
        System.out.println(e1);


    }
}
