package friend_manage;

public class CompFriend extends Friend{
    private String department;

    public CompFriend(String name, String tell, String department){
        super(name, tell);
        this.department = department;
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("부서 : " + department);
    }

}
