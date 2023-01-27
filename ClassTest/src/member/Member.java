package member;

public class Member {
    private String name, id, password;
    private int age;
    public Member(){
    }
    public Member(String name,String id){
        this.name = name;
        this.id = id;
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
    public String getPassworkd() {
        return password;
    }
    public void setPassworkd(String password) {
        this.password = password;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void displayInfo(){
        System.out.println("이름 : " + name);
        System.out.println("ID  : " + id);
        System.out.println("비밀번호 : " + password);
        System.out.println("나이 : " + age);
    }


}
