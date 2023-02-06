package MemberTest;

import java.util.Scanner;

public class Member1 {

    private String name;
    private String id;
    private String pw;
    Scanner sc = new Scanner(System.in);


    public Member1() {

        System.out.print("회원이름 : ");
        this.name = sc.next();
        System.out.print("아이디 : ");
        this.id = sc.next();
        System.out.print("비밀번호 : ");
        this.pw = sc.next();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    @Override
    public String toString() {
        return "Member1{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                '}';
    }
}
