package listTest05;

import java.util.ArrayList;
import java.util.List;

public class TestMember1 {
    public static void main(String[] args) {
        List<Member> list = new ArrayList<>();
        int sum = 0;
        Member m1 = new Member("id1","비번1","이름1",10);
        Member m2 = new Member("id2","비번2","이름2",20);
        Member m3 = new Member("id3","비번3","이름3",30);

        list.add(m1);
        list.add(m2);
        list.add(m3);

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        //List에 저장된 모든 회원의 나이의 합을 출력하라
        for (int i = 0 ; i < list.size(); i++){
            sum = list.get(i).getAge() + sum;
        }

        System.out.println(sum);



        for (int i = 0 ; i < list.size(); i++) {
            if (list.get(i).getName().equals("java")){
                list.remove(i);
            }
        }
    }
}
