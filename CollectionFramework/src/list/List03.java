package list;

import jdk.jfr.Name;

import java.util.ArrayList;
import java.util.List;

public class List03 {
    public static void main(String[] args) {
        //Man 객체가 다수 저장될 수 있는 리스트를 생성
        List<Man> list = new ArrayList<>();

        Man m1 = new Man("김",20);
        Man m2 = new Man("이",30);
        Man m3 = new Man("박",50);

        list.add(m1);
        list.add(m2);
        list.add(m3);

        //저장된 모든 Man 객체를 출력

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        for (Man e : list){
            System.out.println(e);

        }

        //list에 저장된 사람들 중에 이름이 '김'인 사람을 찾아서
        //그 사람의 나이를 출력

        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getName().equals("김")){
                System.out.println(list.get(i).getAge());
            }
        }

        for (Man e : list){
            if (e.getName().equals("김")){
                System.out.println(e.getAge());
            }
        }

    }
}

class Man{

    private String name;
    private int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Stu{
    //이름, 나이, 전공
    private Man man;
    private String major;

    public Stu(String name, int age, String major){
        this.major = major;
        this.man = new Man(name, age);
    }
    public void showInfo(){
        System.out.println("전공 : " + major);
        System.out.println("이름 : " + man.getName());
    }
}