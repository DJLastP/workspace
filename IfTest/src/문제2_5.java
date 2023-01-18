import java.util.Scanner;

public class 문제2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.print("첫번째 수 : ");
        a = sc.nextInt();
        System.out.print("첫번째 수 : ");
        b= sc.nextInt();

        if(a > b){
            System.out.println(a + " > " + b);
        }
        else if(a < b){
            System.out.println(b + " > " + a);

        }
    }
}
