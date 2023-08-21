class Account {
    double balance;
    int agency;
    int number;
    String owner;

    //deposit does not return a value this is established by the type of method
    public void deposit(double balance) {
        this.balance = this.balance + balance;
    }

    //withdraw does return a value
    public boolean withdraw(double balance) {
        if (this.balance >= balance) {
            this.balance = this.balance - balance;
            return true;
        } else{
            return false;
            }
        }
}