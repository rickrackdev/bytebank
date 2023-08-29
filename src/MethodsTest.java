public class MethodsTest {

    public static void main (String[] args){
        Account myAccount = new Account(555, 123);
        myAccount.deposit(300);
        myAccount.deposit(200);
        System.out.println(myAccount.getBalance());

        myAccount.withdraw(100);
        System.out.println(myAccount.getBalance());

        Account accountJimena = new Account(555, 123);
        accountJimena.deposit(1000);
        System.out.println(accountJimena.getBalance() + " jimena");
        boolean canTransfer = accountJimena.transfer(400, myAccount);
        if (canTransfer){
            System.out.println("Transfer successful");
        }
        System.out.println(myAccount.getBalance());
        System.out.println(accountJimena.getBalance() + " jimena");

        Account accountDiego = new Account(555, 123);
        accountDiego.setAgency(1);
        accountDiego.setOwner(new Client());
        accountDiego.getOwner().setName("Diego");
        System.out.println(accountDiego.getOwner().getName());

    }
}
