package cat;

public class AnimalManage {
    //강아지, 고양이가 저장할 공간 5개 만들어야 함.
    public static void main(String[] args) {


        Ani[] cages = new Ani[5];

        cages[0] = new Ani();
        cages[1] = new Cat();
        cages[2] = new Puppy();
        cages[3] = new Puppy();
        cages[4] = new Puppy();

        for (int i = 0; i < cages.length; i++) {
            cages[i].sound();
        }
    }
}