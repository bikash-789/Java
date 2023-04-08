public class Q14 {
    public static void main(String[] args) {
        Employee e[] = new Employee[5];
        e[0] = new Employee(18000, 0, 1000, 5);
        e[1] = new Employee(20000, 2, 500, 4);
        e[2] = new Employee(40000, 3, 500, 2);
        e[3] = new Employee(60000, 10, 2000, 5);
        e[4] = new Employee(70000, 10, 2400, 5);

        for(int i=0; i<5; i++)
        {
            e[i].calculateNetSalary();
            e[i].print();
        }
    }
}

class Employee{
    double basicSalary;
    double incomeTax;
    double providentFund;
    double professionalTax;

    double netSalary;
    // Constructor
    Employee(double basicSalary, double incomeTax, double providentFund, double professionalTax)
    {
        this.basicSalary = basicSalary;
        this.incomeTax = incomeTax;
        this.providentFund = providentFund;
        this.professionalTax = professionalTax;
    }

    // Member function
    void calculateNetSalary()
    {
        double taxAmount = (this.incomeTax / 100 ) * (this.basicSalary) + (this.professionalTax /100)*(this.basicSalary);
        this.netSalary = this.basicSalary - taxAmount - this.providentFund;
    }

    void print()
    {
        System.out.println("Net Salary: "+this.netSalary);
    }
}