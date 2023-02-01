package friend_manage;

public class HobbyFriend extends Friend{
    private String hobby;

    public HobbyFriend(String name, String tell, String hobby) {
        super(name, tell);
        this.hobby = hobby;
    }
    public void showInfo(){
        super.showInfo();
        System.out.println("취미 : " + hobby);
    }
}


