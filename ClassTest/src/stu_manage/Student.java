package stu_manage;

public class Student {
    private String name;
    private int age;
    private String garde;
    private String tell;

    public Student(String name, int age, String tell, String grade){
        this.name = name;
        this.age = age;
        this.tell = tell;
        this.garde = grade;
    }
    public void setTell(String tell){
        this.tell = tell;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getGarde(){
        return garde;
    }
    public String getTell(){
        return tell;
    }

}
