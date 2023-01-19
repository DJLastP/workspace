public class Switch02 {
    public static void main(String[] args) {
        String name = "남자";

        switch (name){
            case "남자":
                System.out.println("남자");
                break;
            case "여자":
                System.out.println("여자");
                break;
            default :
                System.out.println("잘못된 데이터");
        }
    }
}
