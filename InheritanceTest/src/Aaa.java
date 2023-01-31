//자바는 다중상속을 지원하지 않습니다.
//하지만 다중 상속을 한 것처럼 클래스를 구현할 수있 다

import java.net.PortUnreachableException;

public class Aaa {
    int a;
    private int aaa;

    //protected 는 private + 자식까지 사용 허용
    protected int a1;
}
class Bbb extends Aaa{
    int b;
    public void bbb(){
        //private으로 선언된 변수 및 메소드는
        //상속을 받더라도 사용불가
        //aaa = 10;

    }
}
class Ccc extends Bbb{
    public void ccc(){
        a = 10;
        b = 20;

    }
}

