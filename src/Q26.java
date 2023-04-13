public class Q26 {
    public static void main(String[] args) {
        BankCustomer customer = new BankCustomer(1001, "Bikash Chauhan", 200000);
        BankCustomer.EMICalc e = customer.new EMICalc(10, 4);
        double emi = e.findEMI(200000);
        customer.print();
    }
}

class BankCustomer{
    int accNo;
    String accName;
    double loanAmnt;
    double emiAmnt;

    BankCustomer(int accNo, String accName, double loanAmnt)
    {
        this.accNo = accNo;
        this.accName = accName;
        this.loanAmnt = loanAmnt;
    }


    void print()
    {
        System.out.println("Acc Name: "+this.accName);
        System.out.println("Acc No.: "+this.accNo);
        System.out.println("Loan Amount: "+this.loanAmnt);
        System.out.println("EMI amount: "+ this.emiAmnt);
    }
    class EMICalc{
        double interestRate;
        int numOfTerms;

        EMICalc(double r, int n)
        {
            this.interestRate = r;
            this.numOfTerms = n;
        }
        double findEMI(double loanAmnt)
        {
            double x = Math.pow(1+interestRate, numOfTerms);
            double EMI = (loanAmnt * interestRate * x )/(x-1);
            emiAmnt = EMI;
            return EMI;
        }
    }
}
