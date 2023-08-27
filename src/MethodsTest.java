public class MethodsTest {

    public static void main (String[] args){
        Account myAccount = new Account();
        myAccount.balance = 300;
        myAccount.deposit(200);
        System.out.println(myAccount.getBalance());

        myAccount.withdraw(100);
        System.out.println(myAccount.getBalance());

        Account accountJimena = new Account();
        accountJimena.deposit(1000);
        System.out.println(accountJimena.getBalance() + " jimena");
        boolean canTransfer = accountJimena.transfer(400, myAccount);
        if (canTransfer){
            System.out.println("Transfer successful");
        }
        System.out.println(myAccount.getBalance());
        System.out.println(accountJimena.getBalance() + " jimena");

        Account accountDiego = new Account();
        accountDiego.agency = 1;
        accountDiego.owner = new Client();
        accountDiego.owner.name = "Diego";
        System.out.println(accountDiego.owner.name);

    }
}
