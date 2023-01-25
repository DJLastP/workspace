public class 메소드02 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            hello();
        }
    }

    //'안녕하세요'를 출력하는 hello 라는 메소드를 선언
    public static void hello() {
            System.out.println("안녕하세요");
            //메소드의 호출은 main메소드에서만 할 수 있는게 아니다
            tellName();
        }

        public static void tellName () {
            System.out.println("이름은 홍길동입니다.");
        }
}

