public class Q12 {
    public static void main(String[] args) {
        Account a1 = new Account(1001, "Bikash Chauhan", "Saving", 0);
        a1.withdraw(400);
        a1.deposit(500);
        a1.withdraw(400);
        a1.display();
    }
}

// Account class
class Account{
    int accNo;
    String accountHolderName;
    String accType;
    double balance;

    // Constructor
    Account(int accNo, String accountHolderName, String accType, double balance)
    {
        this.accNo = accNo;
        this.accountHolderName = accountHolderName;
        this.accType = accType;
        this.balance = balance;
    }

    // Member functions
    // Deposit function
    void deposit(double amount)
    {
        if(amount < 0.0)
        {
            System.out.println("Enter valid amount!");
            return;
        }
        this.balance += amount;
    }

    // Withdraw function
    void withdraw(double amount)
    {
        if(amount > this.balance)
        {
            System.out.println("Insufficient balance!");
            return;
        }
        this.balance -= amount;
        System.out.println("Amount withdrawn: "+amount);
        System.out.println("Balance remaining: "+this.balance);
    }

    // Display function
    void display()
    {
        System.out.println("Name: "+this.accountHolderName);
        System.out.println("Balance: "+this.balance);
    }


}
