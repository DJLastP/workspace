package study;

public class CallbyReference {
    public static void main(String[] args) {
        //참조자료형(배열, 클래스)
        int[] a = {1};
        int[] b = a;
        b[0] = 3;
        System.out.println("a[0] = " + a[0]);
        System.out.println("b[0] = " + b[0]);
    }
}
