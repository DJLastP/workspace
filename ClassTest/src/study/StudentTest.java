package study;

public class StudentTest {
    public static void main(String[] args) {
        //student 객체가 5개 저장될 수 있는 배열공간 생성
        Students[] student = new Students[5];

        //이름은 홍길동 나이는 90점으로 초기값을 갖는
        //학생 객체 s1을 생성
        Students s1 = new Students("홍길동", 90);
        Students s2 = new Students("이길동", 60);
        Students s3 = new Students("박길동", 70);
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;
        student[3] = new Students("최길동", 60);
        student[4] = new Students("정길동", 60);

        int sum = 0;

        //배열에 들어간 학생 중
        //이름이 정길동인 학생의 점수를 출력
        //2. 배열에 저장된 모든 학생들의 점수의 합을 출력
        //3. 배열에 저장된 학생 중
        //점수가 70점 이상인 학생들의 이름, 점수 출력


        for (int i = 0; i < student.length; i++){
            if(student[i].getName().equals("정길동")){
                System.out.println(student[i].getName());
            }
        }

        for (Students e : student){
            sum += e.getScore();
        }

        for (int i = 0; i < student.length; i++){
            sum = student[i].getScore() + sum;
        }
        int sum2 = 0;
        for (int i = 0; i < student.length; i++){
            if (student[i].getScore() > 70) {
                System.out.println(student[i].getName() + student[i].getScore());
            }
        }

    }
}
