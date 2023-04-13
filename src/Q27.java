import java.util.*;
import java.io.*;
public class Q27 {
    public static void main(String[] args) {
        try{
            BankAccount a = new BankAccount(1002);
            a.doCredit(500);
            a.doDebit(200);
        }
        catch(BalanceNotSufficient e)
        {
            System.out.println(e.getAmount());
        }
    }
}

class BalanceNotSufficient extends Exception{
    double balanceAmnt;
    BalanceNotSufficient(double amnt)
    {
        this.balanceAmnt = amnt;
    }
    double getAmount()
    {
        return this.balanceAmnt;
    }
}

class BankAccount{
    int accNo;
    double balance;

    BankAccount(int accNo)
    {
        this.accNo = accNo;
        this.balance = 0;
    }

    void doCredit(double amnt)
    {
        this.balance += amnt;
        System.out.println("Credited!");
    }

    void doDebit(double amnt) throws BalanceNotSufficient
    {
        if(amnt > this.balance)
        {
            throw new BalanceNotSufficient(this.balance);
        }
        this.balance -= amnt;
        System.out.println("Debited!");
    }
}