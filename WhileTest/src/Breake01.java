public class Breake01 {
    public static void main(String[] args) {

        //만약에 반복문(while for) 안에
        //break가 실행되면 바로 반복문을 벗어남

        for(int i =- 0; i < 6 ; i++){
            System.out.println(i);

            if(i == 3){
                break;
            }
        }
    }
}
