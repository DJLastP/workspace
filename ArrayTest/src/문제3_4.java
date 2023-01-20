
public class 문제3_4 {
    public static void main(String[] args) {
        int[] num;
        num = new int[100];
        int tens = 0;
        int ones = 0;
        for (int i = 0; i < 100; i++) {           //배열에 1~99넣기
            num[i] = i + 1;
        }
        for (int i = 0; i < 100; i++) {                       //배열에 있는거 하나씩꺼내서 조건확인
            if (num[i] < 10) {
                if (num[i] == 3 || num[i] == 6 || num[i] == 9) {
                    System.out.println(num[i] + "  박수한번");
                }
            }
            else if (num[i] > 10) {
                tens = num[i] / 10;
                ones = num[i] % 10;

                if ((ones == 3 || ones == 6 || ones == 9) && (tens == 3 || tens == 6 || tens == 9)){
                    System.out.println(num[i] + "  박수두번");
                }
                else if (num[i] % 10 == 3 || num[i] % 10 == 6 || num[i] % 10 == 9) {
                    System.out.println(num[i] + "  박수한번");

                }
            }
        }
    }
}

