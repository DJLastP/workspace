package rectangle;

public class Rectangle {
    private int x1,x2,y1,y2;

    public Rectangle(){
    }

    public Rectangle(int x1,int x2,int y1, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public void set(int x1, int x2, int y1, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public int square(){
        return (x2 - x1) * (y2 - y1);
    }
    public void show(){
        System.out.println(" 좌표 : (" + x1 + "," + x2 + ")" + "(" + y1 + "," + y2 + ") ");
        System.out.println("넓이 : " + square());
    }

    public boolean equals(Rectangle r){
        if(square() == r.square()) {
            return true;
        }
        else {
            return false;
        }
    }


}
