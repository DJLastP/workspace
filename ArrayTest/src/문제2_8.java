//간단한 로또번호 생성기를 만들어보자. 길이가 6인 정수형 배열을 생성하고
//배열의 모든 요소에 1에서 45까지의 랜덤한 정수를 넣어보자.
//그리고 배열의 모든요소를 출력해보자

public class 문제2_8 {
    public static void main(String[] args) {
        int[] lotto = new int[6];

        for (int i = 0 ; i < lotto.length; i++) {
            //1 <= x <= 45 랜덤한 정수
            int rand = (int) (Math.random() * 45 + 1);
            lotto[i] = rand;
        }
        for(int e : lotto){
            System.out.print(e + " ");
        }
    }
}
