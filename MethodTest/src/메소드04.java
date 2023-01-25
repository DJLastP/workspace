import javax.swing.filechooser.FileSystemView;

public class 메소드04 {
    //매개변수로 정수 두 개를 받아, 두 수의 합을 ''출력''
    //매개변수로 정수 두 개를 받아, 두 수의 합을 ''리턴''
    public static void main(String[] args) {
        //printSum(10,20);
        int a = getSum(10,20);
        System.out.println(a);

        System.out.println(getSum(10,20));

    }
    //void : 메소드 실행 후 리턴할 데이터가 없어요

    public static void printSum(int a, int b){
        System.out.println(a + b);
    }
    //매개변수로 정수 두개를 받아, 두 수의 합을 리턴
    //리턴 : 메소드를 호출한 영역에 결과를 돌려 줌.
    //리턴은 메소드의 마지막에 딱 한번만 호출 가능
    public static int getSum(int a, int b){
        return a + b;
    }
}
