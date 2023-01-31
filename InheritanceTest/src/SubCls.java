public class SubCls extends SuperCls {

    public SubCls(){
        System.out.println("서브생성자1");
    }

    public SubCls(int a){
        super(5,3);
        System.out.println("서브생성자2");
    }

}
