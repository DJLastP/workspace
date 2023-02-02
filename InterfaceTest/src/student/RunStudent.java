package student;

public class RunStudent {
    public static void main(String[] args) {

        Student[] stu = new Student[3];
        stu[0] = new Student("김",90 ,80 ,70 );
        stu[1] = new Student("이",70 ,50 ,75 );
        stu[2] = new Student("배",60 ,85 ,50 );

        StudentTest s = new StudentTest();

        String result = s.getGradeByStudentName(stu,"김");



    }
}
