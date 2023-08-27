public class MethodsTest {

    public static void main (String[] args){
        Account myAccount = new Account();
        myAccount.balance = 300;
        myAccount.deposit(200);
        System.out.println(myAccount.balance);

        myAccount.withdraw(100);
        System.out.println(myAccount.balance);

        Account accountJimena = new Account();
        accountJimena.deposit(1000);
        System.out.println(accountJimena.balance + " jimena");
        boolean canTransfer = accountJimena.transfer(400, myAccount);
        if (canTransfer){
            System.out.println("Transfer successful");
        }
        System.out.println(myAccount.balance);
        System.out.println(accountJimena.balance + " jimena");

        Client diego = new Client();
        diego.name = "Diego";
        diego.document = "428948";
        diego.telephone = "41284242";

        Account accountDiego = new Account();
        accountDiego.agency = 1;
        accountDiego.owner = diego;
        System.out.println(accountDiego.owner.document);

    }
}
