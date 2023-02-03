package student;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;
import java.sql.ResultSetMetaData;

public class StudentTest implements StudentUtil {

    //Student[] stu = new Student[10];

    @Override
    public String getGradeByStudentName(Student[] studentName,String name) {

        int sum = 0;
        String a = "";
        for (int i = 0; i < studentName.length; i++) {
            if (studentName[i].getName().equals(name)) {
                sum = (studentName[i].getEngScore() + studentName[i].getKorScore() + studentName[i].getMathScore()) / 3;
                break;
            } else {
                a = "등급없음";
            }
        }
                if (sum > 90 && sum <= 100) {
                    a = "A";
                } else if (sum > 80 && sum < 89) {
                    a = "B";
                } else if (sum > 70 && sum < 79) {
                    a = "C";
                } else if (sum < 70) {
                    a = "D";
                }
        return a;
    }


    @Override
    public int[] getTotalScoresToArray(Student[] total) {
        int a[] = new int[total.length];
        for (int i = 0; i < total.length; i++) {
                    a[i] = total[i].getMathScore() + total[i].getEngScore() + total[i].getMathScore();
        }
        return a;
    }






    @Override
    public Student getHighScoreStudent(Student name1, Student name2) {
        int a = name1.getMathScore() + name1.getKorScore() + name1.getEngScore();
        int b = name2.getMathScore() + name2.getKorScore() + name2.getEngScore();
        if (a > b){
            return name1;
        } else {
            return name2;
        }
    }

}
