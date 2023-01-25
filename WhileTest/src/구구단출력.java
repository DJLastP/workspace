public class 구구단출력 {
    public static void main(String[] args) {
        for(int i = 1; i < 10; i++){
            for(int j = 2; j < 10; j++){
                String x = "";
                if(i * j < 10){
                    x = " ";
                }
                System.out.print(j + " * " + i + " = " + x + (i * j) + " ");
            }
            System.out.println("");
        }
    }
}
