package calculate;

public class Add {
    private int a,b;

    public void setValue(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int calculate(){
        return a + b;
    }
    public void showAdd(){
        System.out.println(a + " + " + b + " = " + calculate());
    }
}
