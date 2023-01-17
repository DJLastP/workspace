public class 자료형01 {
    public static void main(String[] args) {
        //참, 거짓을 저장할 수 있는 자료형
        boolean bool = true; //false
        System.out.println("bool = " + bool);
        //정수를 저장할 수 있는 자료형
        //byte, short, int, long
        byte num1 = 10;
        //num1 = 128; 오류

        //실수를 저장할 수 있는 자료형
        //float, double
        double num2 = 10.5;
        System.out.println(num2);

        //문자를 저장하는 자료형 char
        //문자 : 한 글자, 반드시 홀따옴표로 감싸야 함.
        //문자열 : 하나 이상의 글자, 반드시 쌍따옴표로 감싸야 함.
        char c = 'A';
        System.out.println("c = " + c);

        int unicode = c;
        System.out.println("unicode = " + unicode);

        //문자열을 저장하는 자료형(기본 자료형X)
        String s = "java";
        System.out.println("s = " + s);
    }
}
