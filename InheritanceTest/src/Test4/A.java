package Test4;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class A {
    private int x;
    private int y;

    public A(){
        this.x = 1;
        this.y = 1;
    }
    public A(int i){
        this.x = i;
        this.y = 1;
    }
    public A(int i,int j){
        this.x = i;
        this.y = j;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}

class B extends A{
    private int x;
    private int y;

    public B() {
        this.x = 1;
        this.y = 1;
    }

    public B(int i){
        super(i);
        this.x = 1;
        this.y = 1;
    }
    public B(int i, int j){
        super(i,j);
        this.x = 1;
        this.y = 1;
    }
    public B(int i, int j, int x){
        super(i,j);
        this.x = x;
        this.y = 1;
            }
    public B(int i, int j, int x, int y){
        super(i,j);
        this.x = x;
        this.y = y;
    }

    public void disp(){
        System.out.println("x : " + getX() + " y : " + getY() + " x : " + x + " y : " + y);
    }

}
