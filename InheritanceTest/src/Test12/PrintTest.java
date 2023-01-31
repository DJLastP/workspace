package Test12;

import java.util.Scanner;

public class PrintTest {
    public static void main(String[] args) {
        //Ink ink = new Ink();
        Razer razer = new Razer();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. 잉크젯 2. 레이저 3.종료");
            System.out.print("출력할 프린터 선택 : ");
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    razer.printInk();
                    break;
                case 2:
                    razer.printRazer();
                    break;
                case 3:
                    System.exit(0);

            }
        }

    }
}
