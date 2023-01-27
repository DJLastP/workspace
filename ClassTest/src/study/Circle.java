package study;

public class Circle {

    //접근제한자 리턴타입 메소드명(){}
    //public  : 누구나
    //privite : 해당 클래스?
    private int r; //반지름.

    public void setR(int r){
        if(r < 0){
            this.r = 0;
        }
        else {
            this.r = r;
        }
    }

    public double getSize(){
        return 2 * 3.14 * r;
    }
}
