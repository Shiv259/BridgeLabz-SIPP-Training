public class temp {
    public static void main(String[] args) {
        BankAccount a = new BankAccount() ;
        a.deposit(500);
        a.checkbalance();
        a.withdrawal(50);
        a.display();
    }

}

class BankAccount {
    private int acc_num = 122455;
    private double balance = 2000.00;

    public double checkbalance() {
        return balance;
    }

    public double deposit(double amount) {
        if (amount > 0)
            balance = balance + amount;
        else
            System.out.println("amount cannot be zero or less");

            return balance;
    }

    public double withdrawal(double amount) {
        if (amount < 0 && amount > balance)
            System.out.println("cannot withdraw");
        else
            balance -=amount ;

            return balance;
    }

    public void display(){
        System.out.println(balance);
    }
}
