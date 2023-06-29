public class CreateAccount {

    public static void main(String[] args){
      // variable          = value
      Account firstAccount = new Account();
      firstAccount.balance = 200;
      System.out.println(firstAccount.balance);
        firstAccount.balance += 100;
        System.out.println(firstAccount.balance);

      Account secondAccount = new Account();
      secondAccount.balance = 50;
        System.out.println(secondAccount.balance);

        System.out.println("first account balance: $" + firstAccount.balance);
        System.out.println("second account balance: $" + secondAccount.balance);
    }
}
