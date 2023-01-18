public class If02 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        //num1과 num2의 합이 50보다 크면
        //"두 수의 합이 50보다 큽니다"를 출력.
        //그렇지 않으면
        //"두 수의 합이 50보다 작습니다"를 출력.
        if(num1 + num2 > 50){
            System.out.println("두 수의 합이 50보다 큽니다.");
        }//else는 if뒤!!
        else {
            System.out.println("두 수의 합이 50보다 작습니다.");
        }

    }
}
