import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Student {
    String name, age, addr, id, num;
    public void setInfo(String name1, String age1, String addr1, String id1, String num1){
        name = name1;
        age = age1;
        addr = addr1;
        id = id1;
        num = num1;
    }
    public void setName(String name1){
        name = name1;
    }
    public void setAge(String age1){
        age = age1;
    }
    public void setAddr(String addr1){
        addr = addr1;
    }
    public void setId(String id1){
        id = id1;
    }
    public void setNum(String num1){
        num = num1;
    }
    public String reName(){
        return name;
    }
    public String reAge(){
        return age;
    }
    public String reAddr(){
        return addr;
    }
    public String reId(){
        return id;
    }
    public String reNum(){
        return num;
    }
    public void printStudent(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(addr);
        System.out.println(id);
        System.out.println(num);
    }
}
