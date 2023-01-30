package students;

public class StudentsPrint {
    StudentsSet stu1 = new StudentsSet();
    //StudentsSet stu2 = new StudentsSet();
    //StudentsSet stu3 = new StudentsSet();

    public StudentsPrint(){

    }

    public void printInfo(){
        System.out.print("이름 : " + stu1.getName());
        System.out.print("나이 : " + stu1.getAge());
        System.out.print("연락처 : " + stu1.getTel());
        System.out.print("점수 : " + stu1.getScore());
    }



}
