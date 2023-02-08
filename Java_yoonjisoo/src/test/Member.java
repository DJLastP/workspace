package test;

import java.util.Scanner;

public class Member {
    private String name;
    private String id;
    private String pw;
    private int age;
    Scanner sc = new Scanner(System.in);

    public void setInfo (String name, String id, String pw, int age) {
        this.name = name;
        this.id = id;
        this.pw = pw;
        this.age = age;
    }

    public void showInfo(){
        System.out.print(" 이름 : " + name);
        System.out.print(" 아이디 : " + id);
        System.out.print(" 비번 : " + pw);
        System.out.println(" 나이 : " + age);
    }

    public boolean isLogin(String id, String pw){
        if (id.equals("java") && pw.equals("abcd1234")){
            return true;
        }
        else {
            return false;
        }


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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
