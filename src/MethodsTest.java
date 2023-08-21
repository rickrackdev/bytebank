public class MethodsTest {

    public static void main (String[] args){
        Account myAccount = new Account();
        myAccount.balance = 300;
        myAccount.deposit(200);
        System.out.println(myAccount.balance);

        myAccount.withdraw(100);
        System.out.println(myAccount.balance);
    }
}
