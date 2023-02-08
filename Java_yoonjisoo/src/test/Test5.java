package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        int[] baseBall = new int[3];
        Scanner sc = new Scanner(System.in);

        //랜덤 숫자 발생

        for (int i = 0; i < 3; i++){
            baseBall[i] = (int)(Math.random() * 9 + 1);
            for(int j = 0; j < i ; j++){
                if (baseBall[i] == baseBall[j]){
                    i--;
                }
            }
        }
        System.out.println("숫자를 정했습니다 게임을 시작합니다.");

        System.out.print("정답확인 : ");
        for (int e : baseBall){
            System.out.print(e + " ");
        }
        System.out.println(" ");



        int count = 1;
        boolean gameSet = true;

        while (gameSet) {
            int strike = 0;
            int ball = 0;

            System.out.print(count + "트 >> ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();


            for (int i = 0; i < baseBall.length; i++) {
                if (a == baseBall[i] && a == baseBall[0]) {
                    strike = strike + 1;
                } else if (a == baseBall[i]) {
                    ball = ball + 1;
                }
            }
            for (int i = 0; i < baseBall.length; i++) {
                if (b == baseBall[i] && b == baseBall[1]) {
                    strike = strike + 1;
                } else if (b == baseBall[i]) {
                    ball = ball + 1;
                }
            }
            for (int i = 0; i < baseBall.length; i++) {
                if (c == baseBall[i] && c == baseBall[2]) {
                    strike = strike + 1;
                } else if (c == baseBall[i]) {
                    ball = ball + 1;
                }
            }
            System.out.println(strike + " 스트라이크 " + ball + " 볼 " );

            if(strike == 3){
                System.out.println(count + " 회 만에 정답을 맞췄습니다.");
                gameSet = false;
            }
            count++;
        }
    }
}
