package Test12;

import java.net.SocketTimeoutException;

public class Print {
    private int used;
    private int paper;

    public Print(){
        this.paper = 100;
    }

    public int getPaper() {
        return paper;
    }

    public void setPaper(int paper) {
        this.paper = paper;
    }
}

class Ink extends Print {

    private String model;
    private String made;
    private String interf;
    private int ink;

    public Ink(){
        this.model = "A";
        this.made = "b";
        this.interf = "USB";
        this.ink = 100;
    }
    public void printInk() {
        System.out.println("잉크프린터 출력");
        super.setPaper(super.getPaper() - 1);
        System.out.println("남은종이 : " + super.getPaper());
        System.out.println("");
    }

}

class Razer extends Ink {

    private String model;
    private String made;
    private String interf;
    private int razer;

    public Razer(){
        this.model = "ㄱ";
        this.made = "ㄴ";
        this.interf = "병렬 인터페이스";
        this.razer = 100;
    }

    public void printRazer() {
        System.out.println("레이저프린트 출력");
        super.setPaper(super.getPaper() - 1);
        System.out.println("남은종이 : " + super.getPaper());
        System.out.println("");

    }
}
