package entities;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;

    public Account(Integer number, String holder) {
        this.number = number;
        this.holder = holder;
        this.balance = 0.0;
    }

    public Account(Integer number, String holder, Double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void deposit(double ammount) {
        balance += ammount;
    }

    public void withdraw(double ammount) {
        balance -= ammount + 5.0;
    }

    public String toString() {
        return "Conta: "
                + number
                + ", Nome: "
                + holder
                + ", Dinheiro: $ "
                + String.format("%.2f", balance);
    }
}