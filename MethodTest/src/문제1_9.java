//이름을 매개변수로 받아 이름을 출력하는 메소드, 나이를 매개변수로 받아 나이를 출력하는 메소드
//주소를 입력받아 주소를 출력하는 메소드를 각각 만들고 출력결과가 아래와 같게 하세요
//이름은 김형진입니다.
//나이는 33세입니다.
//주소는 울산입니다.

public class 문제1_9 {
    public static void main(String[] args) {
        name("윤지수");
        age(100);
        add("미국");
        test("윤지수",200,"한국");

    }
    public static void name(String name){
        System.out.println("주소는 " + name + " 입니다");

    }

    public static void age(int age){
        System.out.println("나이는 " + age + " 살 입니다");
    }

    public static void add(String add){
        System.out.println("주소는 " + add + " 입니다");
            }

    //위의 문제를 하나의 메소드를 사용하여 출력결과가 같게 해보세요
    public static void test(String name,int age,String add){
        System.out.println("이름은 " + name + " 입니다");
        System.out.println("나이는 " + age + "세 입니다");
        System.out.println("주소는 " + add + " 입니다");

    }
}
