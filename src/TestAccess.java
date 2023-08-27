public class TestAccess {
    public static void main (String[] args){
        Account account = new Account();
        account.deposit(200);
        account.withdraw(300);

        System.out.println(account.getBalance());


    }
}
