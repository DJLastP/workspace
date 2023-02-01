package cake;

public class CakeTest {
    public static void main(String[] args) {
        Cake c1 = new CheeseCake();
        //형변환
        //c1은 형 변환 전 메소드 하나만 사용 가능
        CheeseCake c11 = (CheeseCake)c1;
        //형변환을 객체의 자료형을 변경할수있고
        //그로인해서 변수 및 메소드 다 사용가능

        Cake c2 = new StrawberryCheeseCake();
        //CheeseCake c3 = new Cake();       X
        CheeseCake c4 = new StrawberryCheeseCake();
        Cake c44 = (Cake)c4;
        c44.eatCake();
        //StrawberryCheeseCake c5 - new Cake();  X
    }
}
