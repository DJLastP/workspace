package friend_manage;

public class Manager {
    public static void main(String[] args) {
        UniFriend[] ufs = new UniFriend[5];
        CompFriend[] cfs = new CompFriend[5];
        HobbyFriend[] hfs = new HobbyFriend[5];

        //대학 친구 정보 등록
        int uniIndex = 0;
        ufs[uniIndex++] = new UniFriend("홍길동","010","경영");
        ufs[uniIndex++] = new UniFriend("김길동","010","컴공");

        //회사 동료 등록
        int comIndex = 0;
        cfs[comIndex++] = new CompFriend("김대리","011","영업");
        cfs[comIndex++] = new CompFriend("이과장","010","인사");

        //동호회 친구 등록
        int hobIndex = 0;
        hfs[hobIndex++] = new HobbyFriend("최길똥","012","게임");
        hfs[hobIndex++] = new HobbyFriend("박장군","015","낚시");

        for (int i = 0; i < uniIndex; i++){
            ufs[i].showInfo();
        }
        for (int i = 0; i < comIndex; i++){
            cfs[i].showInfo();
        }
        for (int i = 0; i < hobIndex; i++){
            hfs[i].showInfo();
        }

    }
}
