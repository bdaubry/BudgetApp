package Budget;

import java.util.ArrayList;

public class Account {
    private String name;
    private double balance;
    private String bank;
    private String accountType;
    public ArrayList<Expense> expenseTransactions = new ArrayList<>();
    public ArrayList<Income> incomeTransactions = new ArrayList<>();

    public Account(String name, String bank, String accountType){
        this.name = name;
        this.balance = 0;
        this.bank = bank;
        this.accountType = accountType;
    }

    public Account(String name, double balance, String bank, String accountType) {
        this.name = name;
        this.balance = balance;
        this.bank = bank;
        this.accountType = accountType;
    }

    public void debitTransaction(Expense expense){
        this.balance -= expense.getAmount();
        expenseTransactions.add(expense);
    }

    public void creditTransaction(Income income){
        this.balance += income.getAmount();
        incomeTransactions.add(income);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }
}
