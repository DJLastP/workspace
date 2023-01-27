import javax.print.StreamPrintService;

public class Account {
    //변수
    String owner;
    String accountNumber;
    int balance;

    //생성자
    public Account() {
        owner = "";
        accountNumber = "";
        balance = 1000;
    }
    //생성자는 매개변수의 정보가 다르면 여러개 생성 가능!
    //매개변수의 정보 : 매개변수의 개수, 자료형

    public Account(int balance){
        owner = "";
        accountNumber = "";
        this.balance = balance;
    }

    //메소드들..
    //계좌정보변경
    public void setAccInfo(String owner, String accountNumber) {
        this.owner = owner;
        this.accountNumber = accountNumber;
    }

    //계좌정보조회
    public void accInto() {
        System.out.println("예금주 : " + owner);
        System.out.println("계좌번호 : " + accountNumber);
        System.out.println("예금잔액 : " + balance);
    }

    //예금입금
    public void deposit(int money) {
        balance += money;
    }

    //예금출금
    public void withdraw(int money) {
        balance -= money;
    }
}


