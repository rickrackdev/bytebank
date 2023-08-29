public class CreateAccount {

    public static void main(String[] args){
      // variable          = value
      Account firstAccount = new Account(555, 123);
      firstAccount.deposit(200);
      System.out.println(firstAccount.getBalance());
        firstAccount.deposit(100);
        System.out.println(firstAccount.getBalance());

      Account secondAccount = new Account(555, 123);
      secondAccount.deposit(50);
        System.out.println(secondAccount.getBalance());

        System.out.println("first account balance: $" + firstAccount.getBalance());
        System.out.println("second account balance: $" + secondAccount.getBalance());
    }
}
