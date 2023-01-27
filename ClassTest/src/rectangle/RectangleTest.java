package rectangle;

import java.nio.channels.NonWritableChannelException;

public class RectangleTest {
    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        Rectangle s = new Rectangle(1, 2, 1, 3);

        r.show();
        s.show();
        System.out.println(s.square());
        r.set(-2, -1, 2, 4);
        r.show();
        System.out.println(r.square());
        if(r.equals(s)){
            System.out.println("두 사각형은 같습니다.");
        }
    }

}
