package phone;
//상속 가능 여부는 : IS-A 관계가 충족.!
//Ex. Sutdent is a person.;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Phone {
    int phoneNumber;

    public void sendMsg(){
        System.out.println("문자 전송");
    }
}



class SmartPhone extends Phone{
    String os;

    public void PlayApp(){
        System.out.println("앱 실행~");
    }
}
