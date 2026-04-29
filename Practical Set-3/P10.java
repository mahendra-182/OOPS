public class PR10 {
    String account_holder_name;
    double balance;
    static double interest_rate = 5.0;

    public PR10(String name, double balance) {
        this.account_holder_name = name;
        this.balance = balance;
    }

    public double calculateInterest() {
        return (balance * interest_rate) / 100;
    }

    public void display() {
        System.out.println("Account Holder: " + account_holder_name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Earned: " + calculateInterest());
        System.out.println();
    }

    public static void updateInterestRate(double rate) {
        interest_rate = rate;
    }

    public static void main(String[] args) {
        PR10 a1 = new PR10("Mohan", 10000);
        PR10 a2 = new PR10("Ravi", 20000);

        a1.display();
        a2.display();

        PR10.updateInterestRate(7.0);

        System.out.println("After Updating Interest Rate:\n");

        a1.display();
        a2.display();
    }
}