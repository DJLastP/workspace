package math;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class MyMath implements MathUtil{
    @Override
    public int getMin(int a, int b) {
        int result = 0;
        if (a > b){
            result = b;
        }
        else if (a < b ){
            result = a;
        }
        return result;
    }

    @Override
    public double getCirclArea(int radius) {
        if(radius > 0 ){
            return radius * Math.PI * 2;
        }
        else {
            return 0;
        }
    }

    @Override
    public int getMultipul(int num1, int num2) {
        int result = 1;
        for (int i = 0; i < num2; i++){
            result = result * num1;
        }
        return result;
    }
}
