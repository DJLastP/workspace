import java.awt.geom.QuadCurve2D;
import java.util.function.IntBinaryOperator;

public class WrapperTest {
    public static void main(String[] args) {

        Wrapper01 w = new Wrapper01();

        String str = "java";
        w.showData(str);

        Exception01 e = new Exception01();
        w.showData(e);

        Integer num = 5;
        Integer num1 = new Integer(6);
        Double num2 = new Double(1.1);
        w.showData(num1);

        int b = num1;


    }
}
