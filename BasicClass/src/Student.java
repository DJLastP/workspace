import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Student {
    private String name, age, addr, id, num;

    public void setInfo(String name, String age, String addr, String id1 String num){
        this.name = name;
        this.age = age;
        this.addr = addr;
        this.id = id;
        this.num = num;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(String age){
        this.age = age;
    }
    public void setAddr(String addr){
        this.addr = addr;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setNum(String num){
        this.num = num;
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
