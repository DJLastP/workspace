public class OverLoading1 {

    public static void main(String[] args) {
        System.out.println(10);
        System.out.println("자바");
        System.out.println(10.5);

        aaa("");
    }

    public static void aaa(String str) {
        System.out.println(str);
    }
    public static void aaa(int a){
        System.out.println(a);
}
}
