package tv;

public class TVUser {
    public static void main(String[] args) {
        //인터페이스는 생성자가 없으므로 객체생성불가!
        //TV t = new TV();

        //인터페이스명 참조변수명 = new 인터페이스를 구현한 클래스의 생성자
        TV tv = new NewSamsungTV();
        tv.powerOn();
        tv.volumeUp();
        tv.volumeDown();
        tv.powerOff();
    }
}
