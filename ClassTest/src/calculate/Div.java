package calculate;

public class Div {
    private int a,b;

    public void setValue(int a, int b){
        this.a = a;
        this.b = b;
    }

    public double calculate(){
        return a / (double)b;
    }
    public void showDiv(){
        System.out.println(a + " / " + b + " = " + calculate());
    }
}
