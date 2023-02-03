package list;

import java.util.ArrayList;
import java.util.List;

public class List02 {
    public static void main(String[] args) {
        //정수를 여러개 저장할 수 있는 list1
        //List에 저장될 데이터의 자료형은 기본 자료형은 불가
        //래퍼클래스를 사용
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
    }
}
