package student;

//1. 아래 요구사항을 충족하는 메소드를 선언
//2. 완성한 인터페이스를 구현하는 클래스 StudentTest라는
//   student 패키지에 만들고, StudentUtil 인터페이스에서
// 선언한 메소드를 구현

public interface StudentUtil {

    //==첫번째 기능==
    //첫번째 매개변수로 받은 다수의 학생 중
    //두번째 매개변수로 받은 이름을 가진 학생의 점수등급을 리턴
    //단, 전달받은 이름을 가진 학생이 없는 경우, 등급은 "등급없음"이 된다.
    //점수 등급 기준
    // 90 <= 점수 <= 100 -> A
    // 80 <= 점수 <= 89 -> B
    // 70 <= 점수 <= 79 -> C
    // 70 > 점수 -> D
    //메소드명 : getGradeByStudentName

    String getGradeByStudentName(Student[] studentName, String name);

    //==두번째 기능==
    //매개변수로 받은 다수의 학생들의 총점을 배열로 리턴
    //
    //메소드명 : getTotalScoresToArray

    int[] getTotalScoresToArray(Student[] total);

    //==세번째 기능==
    //매개변수로 두 명의 학생이 전달된다.
    //전달된 두 학생중 총점이 높은 학생 객체를 리턴하는 메소드
    //단 두 학생의 총점이 같은 경우는 없다고 가정
    //메소드명 : getHighScoreStudent
    Student getHighScoreStudent(Student name1, Student name2);
}
