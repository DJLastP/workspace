package students;

import javax.naming.Name;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        int a;
        String[][] b = new String[3][4];
        String temp = "";
        StudentsSet set1 = new StudentsSet();
        Scanner sc = new Scanner(System.in);
        StudentsSet[] set;
        set = new StudentsSet[3];
        int cnt = 0;


        while (true) {
            System.out.print("1.학생등록 2.학생정보변경 3. 학생정보출력 4. 모든학생정보출력 5. 프로그램종료 : ");
            a = sc.nextInt();
            if (a == 5) {
                System.exit(0);
            } else {
                switch (a) {
                    case 1:

                        System.out.println("학생 등록을 시작합니다. 학생정보를 입력하세요");
                        System.out.print("이름 : ");
                        set[cnt].setName(sc.next());
                        System.out.print(("나이 : "));
                        set[cnt].setAge(sc.next());
                        System.out.print(("연락처 : "));
                        set[cnt].setAge(sc.next());
                        System.out.print(("학점 : "));
                        set[cnt].setAge(sc.next());
                        cnt++;

                        break;

                    case 2:
                        while (true) {
                            System.out.print("변경 학생 : ");
                            temp = sc.next();
                            System.out.println("");
                            for (int j = 0; j < set.length; j++) {
                                if (set[j].getName().equals(temp)) {
                                    System.out.print("변경학생 : " + temp);
                                    System.out.print("연락처 : ");
                                    set[j].setTel(sc.next());
                                    System.out.println("변경완료");
                                    break;
                                }
                                else{
                                    System.out.println("해당하는 학생이 존재하지 않습니다. 다시업력하세요");
                                }
                            }
                        }

                    case 3:
                        while (true) {
                            System.out.print("정보를 열람할 학생 : ");
                            temp = sc.next();
                            for (int j = 0; j < b.length; j++)
                            if (set[j].getName().equals(temp)) {
                                //출력문 클래스만들어서 거기서출력
                                break;
                            } else {
                                System.out.println("해당하는 학생이 존재하지 않습니다. 다시업력하세요");
                            }
                            break;
                        }


                    case 4:
                        System.out.println("모든 학생의 정보입니다.");
                        System.out.println("현제 총학생은 " + set.length + "명 입니다.");
                        //반복문으로 전체출력

                        break;
                    case 5:
                        break;
                }
            }
        }
    }
}