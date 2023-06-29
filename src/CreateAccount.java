public class CreateAccount {

    public static void main(String[] args){
      // variable          = value
      Account firstAccount = new Account();
      firstAccount.balance = 1000;
      System.out.println(firstAccount.balance);

      Account secondAccount = new Account();
      secondAccount.balance = 500;
        System.out.println(secondAccount.balance);
    }
}
