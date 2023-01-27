public class MemberTest {
    public static void main(String[] args) {


        Member mem = new Member();
        //회원의 모든정보를 세팅
        mem.regMember("홍길동", "abc", "qwer", 30);
        mem.print();

        mem.setName("조양철");
        mem.print();
    }
}
