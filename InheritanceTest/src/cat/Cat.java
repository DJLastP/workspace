package cat;

import java.sql.SQLOutput;

class Ani{
    public void sound(){
        System.out.println("운다");
    }
}

public class Cat extends Ani {
    public void sound(){
        System.out.println("야옹");
    }
}

class Puppy extends Ani{
    public void sound(){
        System.out.println("멍멍");
    }

}
