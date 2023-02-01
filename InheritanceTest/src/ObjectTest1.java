public class ObjectTest1 {


    public static void main(String[] args) {

        Object1 o1 = new Object1();
        o1.aaa();

        //Object클래서에서 상속받은 메소드
        //toString() : 객체의 정보를 문자열로 표현하는 기능
        //클래스 니가 만들었자나
        //그러니까 클래스에 대한 정보를 출력하는 메소드로
        //내가 toString()메소드는 제공해주니까
        //니가 알아서 toString() 메소드를 오버라이디해서
        // 정보를 문자열로 원하는대로 표현해봐.
        // 객체가 가지고 있는 변수들의 값을 문자열로 표현.

        String result1 = o1.toString();
        //o1.equals();
        System.out.println(result1);

    }

}
