package package1;

//접근 제한자
//종류 : public protected default private
//접근 제한자는 클래스, 멤버변수, 메소드에 사용가능
//public : 같은 프로젝트 내에서는 어디든 접근 가능
//default : 같은 페키지 내에서는 접근가능
//private - 선언된 클래스 내에서만 전급가능
//클래스에서 사용 가능한 제한자 : public, defaul
//멤버변수 및 메소드 : 위의 4개 다 사용 가능


import package2.Ccc;

public class Aaa {
    int a1;
    private int a2;
    public int a3;

    public void aaa(){
        Ccc ccc = new Ccc();

        ///Ddd는 default 접근 제한자여서
        //다른 페키지에서 접근 불가
        //Ddd ddd = new Ddd();

    }

    void bbb(){
        Bbb bbb = new Bbb();
    }
    private void ccc(){}
}
