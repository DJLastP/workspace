package calculate;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        int a,b;
        String c = "";
        Add add = new Add();
        Sub sub = new Sub();
        Mul mul = new Mul();
        Div div = new Div();
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 수 : ");
        a = sc.nextInt();
        System.out.print("두 번째 수 : ");
        b = sc.nextInt();
        System.out.print("연산자 : ");
        c = sc.next();

        if(c.equals("+")){
            add.setValue(a, b);
            add.showAdd();
        }
        else if(c.equals("-")){
            sub.setValue(a,b);
            sub.showSub();
        }
        else if(c.equals("*")){
            mul.setValue(a, b);
            mul.showMul();
        }
        else if(c.equals("/")){
            div.setValue(a,b);
            div.showDiv();
        }
    }
}
