//michael
public class Account {
    private String name;
    private int accNum;
    private double balance;

    public Account(String name, int accNum, double balance) {
        this.name = name;
        this.accNum = accNum;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public int getAccNum() {
        return accNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }
}
