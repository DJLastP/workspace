package school;

import java.util.ArrayList;
import java.util.List;

public class SchoolManager {
    public static void main(String[] args) {
        //학교 객체 생성
        School school = new School();

        //학급 생성
        StudyClass c1 = new StudyClass();

        //c1이라는 학급에 들어갈 학생 객체 3개생성

        Student s1 = new Student("김길동", 20 ,"서울시",80);
        Student s2 = new Student("박길동", 30 ,"울산시",70);
        Student s3 = new Student("최길동", 40 ,"부산시",60);

        //위 3명의 학생을 저장할 리스트 생성

        ArrayList<Student> stuList1 = new ArrayList<>();


        stuList1.add(s1);
        stuList1.add(s2);
        stuList1.add(s3);

        //c1이라는 학급에 학생목록정보 세팅
        c1.setStudentsList(stuList1);
        c1.setClassName("캐드반");
        c1.setTeacherName("김선생");

        //c2라는 이름의 학급생성

        StudyClass c2 = new StudyClass();

        //c2교실에 들어갈 학생 3명 생성

        Student s4 = new Student("김자바",25,"서울시",75);
        Student s5 = new Student("박자바",35,"세종시",85);
        Student s6 = new Student("최자바",45,"사천시",65);

        ArrayList<Student> stuList2 = new ArrayList<>();

        stuList2.add(s4);
        stuList2.add(s5);
        stuList2.add(s6);

        c2.setStudentsList(stuList2);
        c2.setTeacherName("박선생");
        c2.setClassName("자바반");

        StudyClass c3 = new StudyClass();

        Student s7 = new Student("김모씨",22,"대구시",77);
        Student s8 = new Student("이모씨",32,"대전시",87);
        Student s9 = new Student("박모씨",42,"광주시",97);

        ArrayList<Student> stuList3 = new ArrayList<>();

        stuList3.add(s7);
        stuList3.add(s8);
        stuList3.add(s9);


        c3.setStudentsList(stuList3);
        c3.setClassName("회계반");
        c3.setTeacherName("백선생");

        //여러 학급 정보를 저장할 수 있는 리스트 생성
        ArrayList<StudyClass> classList = new ArrayList<>();

        classList.add(c1);
        classList.add(c2);
        classList.add(c3);

        school.setClassList(classList);


        //학교 객체가가지고있는 교실 리스트를 가져와 - > 교실리스트에서 학생리스트가져와
        // - > 학생리스트에서 이름가져와
        //school.getClassList().get().getStudentsList().get().getName();


        //school이라는 학교에서 모든학급명 출력

        for (int i = 0; i < school.getClassList().size(); i++)
            System.out.println(classList.get(i).getClassName());



    }
}
