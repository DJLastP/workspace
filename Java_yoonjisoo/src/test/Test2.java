package test;

import java.util.TreeSet;

public class Test2 {
    public static void main(String[] args) {
        int[] lotto = new int[6];

        for (int i = 0; i < 6; i++){
            lotto[i] = (int)(Math.random() * 45 + 1);
            for (int j = 0; j < i; j++){
                if (lotto[i] == lotto[j])
                i--;
            }
        }

        TreeSet<Integer> lotto1 = new TreeSet<>();
        for (int i = 0; i < lotto.length; i++){
            lotto1.add(lotto[i]);
        }

        for (int e : lotto1){
            System.out.println(e);
        }
    }
}
