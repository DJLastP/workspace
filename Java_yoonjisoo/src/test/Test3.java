package test;

import java.text.Format;

public class Test3 {
    public static void main(String[] args) {


        int[]a = {5, 11, 20, 40, 30};
        int max = 0;
        int min = 0;

        for (int i = 0; i < a.length; i++ ) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        min = max;

        for (int i = 0; i < a.length; i++ ) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("최대 값 : " + max + " 최소 값 : " + min);
    }
}
