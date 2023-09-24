package homeworks.august.hw_03_08_23;

public class BankAccount {
    private int balance;

    public BankAccount() {
        balance = 200;
    }

    public void cashWithdrawal(int value) {
        if (balance >= value) {
            balance -= value;
            return;
        }
        System.out.println("Not enough money on the account. Top up the account");
    }

    public void topUp(int value) {
        if (value > 0) {
            balance += value;
            return;
        }
        System.out.println("Top up value must be greater than 0");

    }

    public String toString() {
        return "Balance : " + balance;
    }
}

class BankAccountMain {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        System.out.println(ba);
        System.out.println();
        ba.cashWithdrawal(10);
        System.out.println(ba);
        System.out.println();
        ba.cashWithdrawal(300);
        System.out.println();
        System.out.println(ba);
        System.out.println();
        ba.topUp(50);
        System.out.println();
        System.out.println(ba);
    }
}