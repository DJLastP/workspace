package tv;

public class NewSamsungTV implements TV{
    @Override
    public void powerOn() {
        System.out.println("삼성 전원 켬");
    }

    @Override
    public void powerOff() {
        System.out.println("삼정 전원 끔");
    }

    @Override
    public void volumeUp() {
        System.out.println("삼성 불륨 업");
    }

    @Override
    public void volumeDown() {
        System.out.println("삼성 볼륨 다운");
    }
}
