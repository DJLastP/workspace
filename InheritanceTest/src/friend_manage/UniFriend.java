package friend_manage;

public class UniFriend extends Friend{
    private String major;

    public UniFriend(String name, String tell, String major){
        super(name,tell);
        this.major = major;
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("전공 : " + major);
    }
}
