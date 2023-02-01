//모든 클래스는 object 클래스를 상속하고 있다!

import Test4.A;

public class Object1{

    private String name;
    private int age;


    public void aaa(){
        System.out.println("메소드 실행");

    }

    @Override
    public String toString() {
        return "이름 : " + name + ", 나이 : " + age;
    }
}

