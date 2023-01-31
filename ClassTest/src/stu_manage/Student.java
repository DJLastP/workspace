package stu_manage;

public class Student {
    private String name;
    private int age;
    private String grade;
    private String tell;

    public Student(String name, int age, String tell, String grade){
        this.name = name;
        this.age = age;
        this.tell = tell;
        this.grade = grade;
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
        return grade;
    }
    public String getTell(){
        return tell;
    }

    public void printInfo(){
        System.out.print("이름 : " + name + " ");
        System.out.print("나이 : " + age + " ");
        System.out.print("연락처 : " + tell + " ");
        System.out.println("학점 : " + grade + " ");
    }

}
