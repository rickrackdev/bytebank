public class TestConstructor {
    public static void main(String[] args){
    Account account = new Account(555, 123);
    Account account2 = new Account(332, 123);
    account.setAgency(-4);
        System.out.println(account.getAgency());
        System.out.println(Account.getTotal());
    }
}
