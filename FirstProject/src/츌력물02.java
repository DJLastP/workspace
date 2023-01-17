public class 츌력물02 {
    public static void main(String[] args){
        //()안의 내용이 연산 가능하면 연산 결과를 출력
        System.out.println(3+5);
        System.out.println("3+5");
        //java 에서 글자끼리의 합은 글자글을 나열한 결과와 같다.
        System.out.println("3"+"5"); //"35" 숫자가 아닌 글자
        System.out.println("3"+" 5");//"3 5"
        //문자와 숫자의 합은 문자끼리의 합과 같은 결과
        System.out.println("3"+5);//"35" 글자
        System.out.println(3+5+"2"); //"82" 글자
        System.out.println("3"+5+2); //"352" 글자
        //java 끼리는 문자끼리 더하기만 가능
        System.out.println(1*3+"2");
        System.out.println("1"+3 +2);

    }
}
