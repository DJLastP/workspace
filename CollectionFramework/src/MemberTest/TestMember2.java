package MemberTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestMember2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Member1> list = new ArrayList<>();


        while (true) {
        System.out.print("1.회원등록 2. 회원정보 3.모든회원정보조회 4.회원삭제 5.회원비번변경 6.종료 : ");
            switch (sc.nextInt()) {
                case 1 :
                    Member1 mem = new Member1();
                    list.add(mem);
                    break;

                case 2 :
                    boolean a = true;
                    boolean c = false;

                    while (a) {
                        System.out.print("조회할 이름 : ");
                        String b = sc.next();
                        for (int i = 0; i < list.size(); i++) {
                            if (list.get(i).getName().equals(b)) {
                                System.out.println("회원이름 : " + list.get(i).getName());
                                System.out.println("아이디 : " + list.get(i).getId());
                                System.out.println("비밀번호 : " + list.get(i).getPw());
                                a = false;
                                c  = true;
                                break;
                            }
                        }
                            if (c = false) {
                                System.out.println("정보가 일치하는 회원이 없습니다.");
                            }

                    }
                    break;

                case 3 :
                    System.out.println("회원수는 " + list.size() + "명 입니다.");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i));
                    }
                    break;
                case 4 :

                    a = true;
                    while (a) {
                        for (int i = 0; i < list.size(); i++) {
                            System.out.print("삭제할 이름 : ");
                            if (list.get(i).getName().equals(sc.next())) {
                                System.out.println(list.get(i).getName() + "회원을 삭제하였습니다");
                                list.remove(i);
                                a = false;
                            }
                            System.out.println("정보가 일치하는 회원이 없습니다.");

                        }
                    }
                    break;

                case 5 :
                    a = true;
                    while (a) {
                        for (int i = 0; i < list.size(); i++) {
                            System.out.print("비번변경할 이름 : ");
                            if (list.get(i).getName().equals(sc.next())) {
                                System.out.println(list.get(i).getName() + "비번을 변경하였습니다");
                                list.get(i).setPw(sc.next());
                                a = false;
                            } else {
                                System.out.println("정보가 일치하는 회원이 없습니다.");
                            }
                        }
                    }
                    break;

                case 6 :
                    System.exit(0);


            }

        }
    }
}
