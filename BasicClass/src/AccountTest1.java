public class AccountTest1 {
    public static void main(String[] args) {
        Account acc = new Account();
        Account acc1 = new Account(10000);
        acc.accInto();
        acc.setAccInfo("홍길동","123-111");
        acc.deposit(10000);
        acc.withdraw(6000);
        acc.accInto();
    }
}
