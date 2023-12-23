import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amt) {
        balance += amt;
        System.out.println(amt + " Rs deposited succesfully..");

    }

    public void withdrwal(double amt) {
        if (amt > balance) {
            System.out.println("Sorry.. you hava insufficient balance");
        } else {
            balance -= amt;
            System.out.println(amt + " Rs withdrwal succeful");
        }
    }

}

public class AtmMachine {
    private BankAccount userAccount;

    public AtmMachine(BankAccount userAccount) {
        this.userAccount = userAccount;
    };

    public void displayOptions() {
        System.out.println("WEL-COME to ATM :");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void transaction(int option) {
        try {
            Scanner sc = new Scanner(System.in);
            switch (option) {
                case 1:
                    System.out.println("Enter the withdrawl amt ");
                    userAccount.withdrwal(sc.nextDouble());
                    break;
                case 2:
                    System.out.println("Enter the deposit amt ");
                    userAccount.deposit(sc.nextDouble());
                    break;
                case 3:
                    System.out.println("Acc Balance :" + userAccount.getBalance());
                    break;
                case 4:
                    System.out.println("Transcation ended, Thankyou for visit");
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Please choose a valid option.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("please enter valid Input");
        }

    }

    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(100);

        AtmMachine atm = new AtmMachine(userAccount);
        Scanner sc = new Scanner(System.in);
        while (true) {
            atm.displayOptions();

            System.out.println("choose the transaction");
            int option = sc.nextInt();

            if (option >= 1 && option <= 4) {
                atm.transaction(option);

            } else {
                System.out.println("invalid option ");
            }
        }
    }

}
