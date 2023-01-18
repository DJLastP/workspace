public class 연산자03 {
    public static void main(String[] args) {
        //증감연산자
        //1. 전위증감연산자
        //   변수의값을 1 증가 혹은 1감소 시킴.
        //   먼저 변수의 값을 1증가 감소 시킨 후 나머지 연산 진행
        //2. 후위증감연사자
        //   변수의값을 1 증가 혹은 1감소 시킴.
        //   연산을 먼저 진행 한후 변수의 값을 1 증가 감소 시킴.
        // ++, --
        int num1 = 10;
        //num1 값을 1 증가 시키는 코드
        num1 = num1 +  1;
        num1 +=1;
        ++num1;
        num1++;

        //--------------------------------------
        int num2 = 10;
        int result;
        result = ++num2;
        System.out.println("num2 = " + num2);
        System.out.println("result = " + result);


        result = num2++;
        System.out.println("num2 = " + num2);
        System.out.println("result = " + result);

        int num3 = 5;
        System.out.println(++num3);
        System.out.println(num3++);
    }
}
