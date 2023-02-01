public class Objecttest2 {
    public static void main(String[] args) {

        ToStringTest t1 = new ToStringTest();


        String result1 = t1.toString();
        System.out.println(result1);

        System.out.println(t1.toString());
        //객체명을 출력하면 자동으로
        //객체명 뒤에 .toString()이 붙어서 실행
        System.out.println(t1);



    }
}
