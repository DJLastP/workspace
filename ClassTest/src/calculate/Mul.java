package calculate;

public class Mul {
    private int a,b;

    public void setValue(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int calculate(){
        return a * b;
    }
    public void showMul(){
        System.out.println(a + " * " + b + " = " + calculate());
    }
}
