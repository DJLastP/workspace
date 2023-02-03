package listTest;

import java.util.ArrayList;
import java.util.List;

public class ListTest03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("홍길동");
        list.add("박길동");
        list.add("최길동");
        list.add("김길동");
        list.add("이길동");

        for (int i = 0; i < list.size(); i++){
            if (list.get(i).equals("홍길동")){
                System.out.println("해당이름이 존재합니다.");
            }
        }
    }
}
