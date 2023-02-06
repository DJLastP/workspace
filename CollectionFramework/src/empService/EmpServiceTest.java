package empService;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpServiceTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<EmpService> list = new ArrayList<>();

        //임시데이터 입력
        EmpService emp = new EmpService("홍길동","1000","0000", "0000", 1000, "인사부");
        EmpService emp1 = new EmpService("김길동","1001","0000", "0001", 2500, "인사부");
        EmpService emp2 = new EmpService("이길동","1002","0000", "0002", 1500, "인사부");
        EmpService emp3 = new EmpService("박길동","1003","0000", "0003", 3000, "영업부");
        EmpService emp4 = new EmpService("최길동","1004","0000", "0004", 2000, "영업부");
        EmpService emp5 = new EmpService("윤길동","1005","0000", "0005", 1500, "영업부");
        EmpService emp6 = new EmpService("정길동","1006","0000", "0006", 2500, "개발부");
        EmpService emp7 = new EmpService("홍길동","1007","0000", "0007", 3000, "개발부");
        EmpService emp8 = new EmpService("장길동","1008","0000", "0008", 2000, "개발부");

        list.add(emp);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);
        list.add(emp6);
        list.add(emp7);
        list.add(emp8);

        while (true) {
            boolean idCheck = false;
            boolean pwCheck = false;
            int a = 0;

            System.out.print("사번 : ");
            String id1 = sc.next();
            System.out.print("비밀번호(연락처 뒤4자리) : ");
            String pw1 = sc.next();

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getId().equals(id1)) {
                    idCheck = true;
                    a = i;
                    break;
                }
            }
            for (int i = 0; i < list.size(); i++) {

                if (list.get(i).getPw().equals(pw1)) {
                    pwCheck = true;
                    break;
                }
            }

            if ((idCheck == true) && (pwCheck == true)) {
                System.out.println("로그인 하였습니다.");
                System.out.println(list.get(a).getName() + "님 반갑습니다.");

                break;
            } else {
                System.out.println("사번 혹은 비밀번호가 일치하지 않습니다.");
            }
        }


        while (true) {
            System.out.print("1.부서별월급정보 2.부서별 월급인상 3.모든부서정보보기 4.종료 : ");
            switch (sc.nextInt()){
                case 1 :
                    int sum = 0;
                    int count = 0;


                    System.out.print("부서명 : ");
                    String a = sc.next();
                    System.out.println(a + "월급 현황");
                    for(int i = 0; i < list.size(); i++) {
                        if (list.get(i).getDep().equals(a)){
                            System.out.println("이름 : "+ list.get(i).getName() + "월급 :" + list.get(i).getPay());
                            sum += (list.get(i).getPay());
                            count++;
                        }
                    }
                    System.out.println(a + "의 월급 총액은" + sum + "이고 평균 급여는 " + (sum / count) + "입니다." );
                    break;

                case 2 :
                    System.out.print("부서명 : ");
                    a = sc.next();
                    int sum2 = 0;
                    System.out.print("인상 급여 :");
                    int b = sc.nextInt();
                    System.out.println(a + "각 사원의 급여가 각각" + b + "원씩 인상됩니다.");
                    for (int i = 0; i <list.size(); i++){
                        if (list.get(i).getDep().equals(a)){
                            list.get(i).setPay(list.get(i).getPay()+b);
                            System.out.println("이름 : "+ list.get(i).getName() + "월급 :" + list.get(i).getPay());
                        }
                    }
                    break;
                case 3 :
                    int count1 = 0;
                    int[] result = new int[3];

                    System.out.println("모든 사람의 월급 현황");
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).getDep().equals("인사부")) {
                            System.out.println("이름 : " + list.get(i).getName() + "월급 :" + list.get(i).getPay());
                            result[0] = result[0] + list.get(i).getPay();
                        }
                    }
                    System.out.println("인사부 월급 소계 : " + result[0]);

                        for (int i = 0; i < list.size(); i++) {
                            if (list.get(i).getDep().equals("개발부")) {
                                System.out.println("이름 : " + list.get(i).getName() + "월급 :" + list.get(i).getPay());
                                result[1] = result[1] + list.get(i).getPay();
                            }
                        }
                    System.out.println("개발부 월급 소계 : " + result[1]);

                            for (int i = 0; i < list.size(); i++) {
                                if (list.get(i).getDep().equals("영업부")) {
                                    System.out.println("이름 : " + list.get(i).getName() + "월급 :" + list.get(i).getPay());
                                    result[2] = result[2] + list.get(i).getPay();
                                }
                            }
                    System.out.println("영업부 월급 소계 : " + result[2]);

                    System.out.println("전 직원 월급 총계 : " + (result[0] + result[1] + result[2]));
                    break;


                case 4 :
                    System.exit(0);
        }
    }

        //부서의 월급정보 출력
        //부서의 월급인상
        //모든 부서별 월급 소계와 사원 전체월급의 총계출력


    }
}
