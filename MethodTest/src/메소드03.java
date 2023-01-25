public class 메소드03 {
    public static void main(String[] args) {
    //메소드를 호출할 때는
    //메소드명이 같아야 하고
    //매개변수의 정보도 같아야함
    //매개변수의 정보 : 자료형, 매개변수의 개수
    tellAge(10);
    tellAge(30);
    //tellAge("java");    매개변수의 자료형 불일치.
    //tellAge();          매개변수의 개수 불일치
    tellInfo("홍길동",30);
    }

    //int age : 매개변수
    public static void tellAge(int age){
        System.out.println("나이는 " + age);
    }

    public static void tellInfo(String name,int age){
        System.out.println(name + age);
    }
}
