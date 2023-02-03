package listTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTest2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 5; i++){
            System.out.print((i + 1) +  " 번째 정수 입력 : ");
            list.add(sc.nextInt());
        }
        for (int i = 0; i < list.size(); i++){
            sum = (sum + list.get(i));
        }
        System.out.println(sum);
    }
}
