public class String01 {
    public static void main(String[] args) {

        //String 클래스의 객체 생성 방법
        //첫번째 방식
        //문자열이 동일하면 새로운 객체를 만들지 않고,
        //메모리 공간을 낭비하지 않도록 같은 데이터를 참조한다.

        String str1 = "hello java";
        String str2 = "hello java";

        //두번째 방식
        //new 키워드가 새로운 객체를 생성한다는 명령어이기 때문에
        //문자열이 같더라도 객체를 새로 생성해 준다.
        String str3 = new String("hello java");
        String str4 = new String("hello java");

        // == 의미
        // 숫자비교에서는 두 수가 같은 수인지를 판별
        // 객체비교에서는 두 객체가 동일한 참조값을 가지는지 판별
        if(str1 == str2){
            System.out.println(1);
        }

        if(str3 == str4){
            System.out.println(2);
        }

    }
}
