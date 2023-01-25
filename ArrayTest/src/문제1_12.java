//간단한 성적처리 시스템을 만들어보자, 국어, 영어, 수학점수를 입력받아
//각과목에 대한 점수 및 총점, 평균을 출력하는 프로그램을 만들어보자. 반드시 배열을 사용

import java.util.Scanner;

public class 문제1_12 {
    public static void main(String[] args) {
        int sum = 0;            //총점변수
        //int avg = 0;            //평균변수
        int[] score;            //입력받은 점수를 저장하는 배열
        String[] a = {"국어", "영어", "수학"};
        score = new int[a.length];
        Scanner sc = new Scanner(System.in);

        //점수를 입력받고 입력받은 점수를 배열에 저장
        for (int i = 0; i < a.length; i++) {
            while (true) {
                System.out.print(a[i] + "점수를 입력하세요 : ");
                score[i] = sc.nextInt();
                if (score[i] >= 0 && score[i] <= 100) {
                    break;
                }
            }
        }
        for (int e : score) {                   //합계 계산
            sum = sum + e;
        }

        //결과출력

        for (int i = 0; i < score.length; i++ ){
            System.out.println(a[i] + "점수는 " + score[i] + "점 입니다.");  //각각 점수 출력
        }
        System.out.println("총점은 : " + sum + "점 입니다.");
        System.out.println("평균은 : " + (sum/(double)score.length) + "점 입니다.");



        }
    }
