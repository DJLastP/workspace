package study;


import java.text.Format;

public class MemberTest {
    public static void main(String[] args) {
        //Member 클래스에 대한 객체를 3개 저장할 수있는
        //배열을 만들어서 각 배열에 member 객체저장.
        //Member 객체가 들어갈 수 있는 공간 3개 생성.
        Member[] members;
        members = new Member[3];

        Member m1 = new Member();
        m1.setInfo("홍길동", 20);
        members[0] = m1;

        Member m2 = new Member();
        m2.setInfo("이순신", 30);
        members[1] = m2;

        Member m3 = new Member();
        m3.setInfo("이순신", 30);
        members[1] = m3;

        //members 배열의 0번째 요소에 들어간
        //회원의 정보를출력
        members[0].showInfo();

        //members 배열에 저장된 모든 회원의 정보출력
        for(int i = 0; i <members.length; i++){
            members[i].showInfo();
        }
        for(Member e : members){

        }
    }
}
