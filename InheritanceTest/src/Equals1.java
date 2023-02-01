public class Equals1 {
    String name;
    int age;



    public Equals1(String name, int age){
        this.name = name;
        this.age = age;
    }
    //이름과 나이가 같은 객체면 동일한 객체
    @Override
    public boolean equals(Object obj) {
        Equals1 e = (Equals1)obj;

        if (name.equals(e.name) && age == e.age) {
            return true;
        }
            else{
                return false;
            }
        }

    //@ -> anotation 어노테이션
    // 어노테이션 : 개발자의 실수를 미연에 방지해주는 기능
    //

        @Override //오버라이딩 문법이 맞는지 검사
    public String toString() {
        return "Equals1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

