public class Man {
    String name,age,addr;

    //생성자 constructor
    //리턴타입이 없다.
    //생성자와 클래스의 이름은 같아야한다.
    public Man(){
        name = "지정되지 않음";
        age = "1";
        addr = "신원불명";
    }

    public void initMan(String name, String age, String addr){
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
//this!!!! 이클래스의 변수 setter에서는 붙어야한다.

    public void printMan(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(addr);
    }
}
