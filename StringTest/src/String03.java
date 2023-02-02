public class String03 {
    public static void main(String[] args) {
        //String 클래스에서 선언된 유용한 메소드
        String str1 = "coffee";
        String str2 = "bread";

        //length() -> 문자열의 길이를 리턴
        System.out.println(str1.length());

        //concat() -> 두 문자열을 연결 +
        String result1 = str1.concat(str2);
        System.out.println(result1);  // == str1 + str2

        String str3 = "abcdefg";
        //일부 문자열 추출
        //2번째 문자부터 마지막까지 추출
        String result2 = str3.substring(2);
        System.out.println(result2); // cdefg
        //1번부터 4번까지 출력
        String result3 = str3.substring(1,4);
        System.out.println(result3);  // bcd

        //숫자들을 문자열로 변경
        String result4 = String.valueOf(10);

        //문자열 슬라이스
        String str4 = "ab,cd,ef";
        String[] result5 =  str4.split(",");

    }
}
