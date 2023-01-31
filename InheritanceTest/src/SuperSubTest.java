import java.beans.Customizer;
import java.nio.channels.NonWritableChannelException;
import java.util.concurrent.SubmissionPublisher;

public class SuperSubTest {
    public static void main(String[] args) {

        SubCls c1 = new SubCls();
        System.out.println();
        SuperCls c2 = new SuperCls(5);
        System.out.println();
        SuperCls c3 = new SubCls(3);

    }
}
