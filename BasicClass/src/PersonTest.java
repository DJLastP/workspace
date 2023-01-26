import javax.sound.midi.Soundbank;

public class PersonTest {
    public static void main(String[] args) {
        //person 클래스에 대한 객체 p1 생성
        //new : 새로운 객체를 생성해주세요
        Person p1 = new Person();
        //p1의 이름, 나이 값을 변경하는 코드
        p1.name = "홍길동";
        p1.age = 20;

        //p1 객체의 모든 정보 출력
        System.out.println("이름 : " + p1.name);
        System.out.println("나이 : " + p1.age);
        System.out.println("주소 : " + p1.addr);

        System.out.println();

        //person 클래스에 댈한 객체 p2생성
        Person p2 = new Person();

        //p2 객체의 이름, 나이를 변경
        p2.setName("김길동");
        p2.setAge(20);

        //p2 객체의 모든 정보 출력
        p2.printPersonInfo();
    }
}
