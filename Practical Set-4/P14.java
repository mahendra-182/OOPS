class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;

    public void openAccount(String accNo, String name, double bal) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = bal;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavingAccount extends BankAccount {
    public double calculateInterest() {
        return balance * 0.04;
    }
}

class FixedDepositAccount extends BankAccount {
    public double maturityAmount(int years) {
        return balance * Math.pow(1.06, years);
    }
}

public class PR14 {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount();
        sa.openAccount("101", "Darshil", 10000);
        sa.deposit(2000);
        sa.withdraw(1500);
        sa.checkBalance();
        System.out.println("Saving Interest: " + sa.calculateInterest());

        System.out.println();

        FixedDepositAccount fd = new FixedDepositAccount();
        fd.openAccount("102", "Ravi", 20000);
        fd.checkBalance();
        System.out.println("Maturity Amount (3 years): " + fd.maturityAmount(3));
    }
}