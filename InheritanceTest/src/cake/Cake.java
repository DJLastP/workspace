package cake;

public class Cake {
    public void eatCake(){
        System.out.println("케익을 먹다.");
    }

}

class CheeseCake extends Cake{
    public void eatCheeseCake(){
        System.out.println("치츠 케익 먹다.");
    }
}

class StrawberryCheeseCake extends CheeseCake{
    public void eatStrawberryCheeseCake() {
        System.out.println("딸기치즈케익먹다.");
    }
}
