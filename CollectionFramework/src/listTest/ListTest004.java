package listTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest004 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 10; i++){
            list.add((int)(Math.random() * 100 + 1));
        }
        for (int i = 0; i < list.size(); i++){
            sum = (sum + list.get(i));
        }
        System.out.println("모든 수의 합 : " + sum);
    }
}
