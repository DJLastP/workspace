package friend_manage;

public class UpgradeManager {
    public static void main(String[] args) {
        Friend[] fs = new Friend[10];

        //친구 등록
        int index = 0;
        fs[index++] = new UniFriend("김","0","컴공");
        fs[index++] = new UniFriend("이","2","컴공");
        fs[index++] = new CompFriend("치", "3", "이");
        fs[index++] = new CompFriend("사", "4", "사");

        for (int i = 0; i < index;i++){
            fs[i].showInfo();
        }
    }
}
