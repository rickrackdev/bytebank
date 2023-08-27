class Account {
    private double balance;
    private int agency;
    private int number;
    Client owner;

    //deposit does not return a value this is established by the type of method
    public void deposit(double balance) {
        this.balance += balance;
    }

    //withdraw does return a value
    public boolean withdraw(double balance) {
        if (this.balance >= balance) {
            this.balance -= balance;
            return true;
        } else {
            return false;
            }
        }

    public boolean transfer(double balance, Account account){
        if (this.balance >= balance){
            this.balance -= balance;
            account.deposit(balance);
            return true;
        } else {
            return false;
        }
    }
    public double getBalance(){
        return balance;
    }

    public int getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }

    public void setAgency(int agency){
        if (agency > 0) {
            this.agency = agency;
        }
    }

    public void setNumber(int number){
        this.number = number;
    }
}