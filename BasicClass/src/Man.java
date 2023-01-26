public class Man {
    String name,age,addr;
    public void setMan(String name1, String age1, String addr1){
        name = name1;
        age = age1;
        addr = addr1;
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
    public String getName(){
        return name;
    }
    public String getAge(){
        return age;
    }
    public String getAddr(){
        return addr;
    }
    public void printMan(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(addr);
    }
}
