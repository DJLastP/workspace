public class Calculator {
    private int num1, num2;
    String a;

    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public void setA(String a) {
        this.a = a;
    }

    public int getNum1(){
        return num1;
    }
    public int getNum2(){
        return num2;
    }
    public String getA(){
        return a;
    }

    public int sum(){
        return num1 + num2;
    }
    public int min(){
        return num1 - num2;
    }
    public int mul(){
        return num1 * num2;
    }
    public double dev(){ return num1 / (double)num2; }

    public void getSum(){
        System.out.println(getNum1() + " " + getA() + " " + getNum2() + " = " + sum());
    }
    public void getMin(){
        System.out.println(getNum1() + " " + getA() + " " + getNum2() + " = " + min());
    }
    public void getMul(){
        System.out.println(getNum1() + " " + getA() + " " + getNum2() + " = " + mul());
    }
    public void getDev(){
        System.out.println(getNum1() + " " + getA() + " " + getNum2() + " = " + dev());
    }
}

