package studentTest;

import java.util.ArrayList;
import java.util.List;

public class TestStudent1 {
    public static void main(String[] args) {
        List<Student1> list = new ArrayList<>();

        Student1 stu1 = new Student1("김",50,60);
        Student1 stu2 = new Student1("이",60,70);
        Student1 stu3 = new Student1("박",90,80);

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        for (int i = 0; i < list.size(); i++){
            if(list.get(i).getTotalScore() > 150){
                System.out.println(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).getAvgScore());
        }
    }
}
