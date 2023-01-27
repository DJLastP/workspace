import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class Member {
    String name;
    String id;
    String pw;
    int age;

    //회원등록을 위한 메소드
    public void regMember(String name1,String id1,String pw1,int age1){
        name = name1;
        id = id1;
        pw = pw1;
        age = age1;
    }
    //각각 정보변경 메소드
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
    //이름을 출력하는 메소드
    public String getName(){
        return name;
    }
    public void print(){
        System.out.println("이름은 : " + name);
        System.out.println("ID는 : " + id);
        System.out.println("비밀번호는 : " + pw);
        System.out.println("나이는 : " + age);
    }
}
