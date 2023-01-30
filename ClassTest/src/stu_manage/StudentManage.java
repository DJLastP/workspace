package stu_manage;


import com.sun.source.tree.WhileLoopTree;

import javax.print.StreamPrintService;
import javax.swing.plaf.BorderUIResource;
import java.util.Scanner;

public class StudentManage {
    //학생등록
    Scanner sc;
    Student[] students;
    int index;
    String namechk;


    public StudentManage(){
        sc = new Scanner(System.in);
        students = new Student[3];
        index = 0;
        namechk = "";
    }

    public void regStudent() {

        if (index < 3) {
            System.out.println("학생 등록 시작 학생정보입력");
            System.out.print("이름 : ");
            String name = sc.next();
            System.out.print("나이 : ");
            int age = sc.nextInt();
            System.out.print("연락처 : ");
            String tell = sc.next();
            System.out.print("학점 : ");
            String grade = sc.next();

            //입력받은 정보를 가진 학생 객체 생성
            Student stu = new Student(name, age, tell, grade);
            //생성한 객체를 배열에 저장
            students[index] = stu;
            index++;
        } else{
            System.out.println("더 이상 등록 불가합니다");
        }
    }
    //학생정보변경(연락처)
    public void setStuInfo(){
        while (true) {
            System.out.println("학생의 연락처를 변경합니다.");
            System.out.print("변경학생 : ");
            namechk = sc.next();

            for (int i = 0; i < students.length; i++) {
                if (students[i].getName().equals(namechk)) {
                    System.out.println("변경 학생 : " + students[i].getName());
                    System.out.print("연락처 : ");
                    String changeAge = sc.next();
                    students[i].setTell(changeAge);
                    break;
                } else {
                    System.out.println("해당하는 학생이 없습니다 다시입력하세요");
                }
            }
            break;

        }
    }

    //학생정보출력
    public void showStuInfo() {
        while (true) {
            System.out.print("정보를 열람할 학생 : ");
            namechk = sc.next();
            for (int i = 0; i < students.length; i++) {
                if (students[i].getName().equals(namechk)) {
                    System.out.println("요청하신 학생의 정보입니다.");
                    System.out.println("이름 : " + students[i].getName());
                    System.out.println("나이 : " + students[i].getAge());
                    System.out.println("연락처 : " + students[i].getTell());
                    System.out.println("점수 : " + students[i].getGarde());
                    break;
                } else {
                    System.out.println("해당 학생 존재하지 않습니다.");
                }
            }
            break;
        }
    }

    //모든 학생 정보 실행
    public void showAll(){
        for (int i = 0; i < students.length; i++){
            System.out.print("이름 : " + students[i].getName());
            System.out.print("나이 : " + students[i].getAge());
            System.out.print("연락처 : " + students[i].getTell());
            System.out.print("점수 : " + students[i].getGarde());
        }
    }


}
