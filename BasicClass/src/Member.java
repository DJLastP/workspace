public class Member {
    String name;
    String id;
    String pw;
    int age;

    public void setName(String name1){
        name = name1;
    }

    public void setId(String id1){
        id = id1;
    }
    public void setPw(String pw1){
        pw = pw1;
    }
    public void setAge(int age1){
        age = age1;
    }
    public void print(){
        System.out.println("이름은 : " + name);
        System.out.println("ID는 : " + id);
        System.out.println("비밀번호는 : " + pw);
        System.out.println("나이는 : " + age);
    }
}
