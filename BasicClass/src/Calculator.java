public class Calculator {
    int num1, num2;
    String a;

    public void setNum1(int num3) {
        num1 = num3;
    }
    public void setNum2(int num4) {
        num2 = num4;
    }
    public void setA(String a1) {
        a = a1;
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
    public int dev(){
        return num1 / num2;
    }
}

