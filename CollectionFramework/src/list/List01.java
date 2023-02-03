package list;

import java.util.ArrayList;
import java.util.List;

public class List01 {
    public static void main(String[] args) {
        //ArrayList 사용

        //데이터가 여러개 저장될 수 있는 통을 생성
        //같은 자료형의 데이터만 들어갈 수 있음.
        //<>안에는 저장할 데이터의 자료형을 지정.
        ArrayList<String> list1 = new ArrayList<>();
        List<String> list = new ArrayList<>();

        //데이터 저장
        list.add("java");
        list.add("c++");
        list.add("python");
        list.add("python");

        //데이터 삭제
        list.remove(0);

        //데이터 읽기
        list.get(0);
        System.out.println(list.get(0));

        //list에 저장된 데이터의 개수
        System.out.println(list.size());

        //list에 저장된 모든 데이터 출력

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
