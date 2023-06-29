public class TestReference {

    public static void main (String[] args){
        //creating a new account and adding a balance
        Account firsAccount = new Account();
        firsAccount.balance = 200;
        //creating a second account and referencing it to the first one + adding a new balance
        //this will override the balance that we set on the first variable as we are referencing
        //the same position in memory
        Account secondAccount = firsAccount;
        secondAccount.balance = 100;

        System.out.println("The balance in the first account is: " + firsAccount.balance);
        System.out.println("The balance in the second account is: " + secondAccount.balance);

        //when we add funds to the second account this will also be reflecting in the first account
        //as they are both pointing at the same space in memory
        secondAccount.balance += 400;
        System.out.println("The balance on the first account is: " + firsAccount.balance);

        //we can see that the 2 variables are pointing to the same space in memory
        System.out.println(firsAccount);
        System.out.println(secondAccount);
    }
}
