package calculate;

public class Sub {
    private int a,b;

    public void setValue(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int calculate(){
        return a - b;
    }

    public void showSub(){
        System.out.println(a + " - " + b + " = " + calculate());
    }
}
