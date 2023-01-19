public class continue01 {
    public static void main(String[] args) {

        //만약에 반복문(for while)안에
        //continue 키워드를 만나면
        //해당 순번만 건너뛴다
        for(int i =- 0; i < 6 ; i++){
            if(i == 3){
                continue;
            }
            System.out.println(i);
        }
    }
}
