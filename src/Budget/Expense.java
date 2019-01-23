package Budget;

import java.util.Date;

public class Expense {
    private final int expenseIndex;
    private int nextIndexVal = 1;
    private double amount;
    private String description;
    private String paidTo;
    private Date date;

    public Expense(double amount){
        this.expenseIndex = nextIndexVal;
        nextIndexVal++;
        this.amount = amount;
        this.description = "No description";
        this.paidTo = "No paid to";
        this.date = new Date();
    }

    public Expense(double amount, String description){
        this.expenseIndex = nextIndexVal;
        nextIndexVal++;
        this.amount = amount;
        this.description = description;
        this.paidTo = "No paid to";
        this.date = new Date();
    }

    public Expense(double amount, String description, String paidTo, Date date) {
        this.expenseIndex = nextIndexVal;
        nextIndexVal++;
        this.amount = amount;
        this.description = description;
        this.paidTo = paidTo;
        this.date = date;
    }

    public int getExpenseIndex() {
        return expenseIndex;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPaidTo() {
        return paidTo;
    }

    public void setPaidTo(String paidTo) {
        this.paidTo = paidTo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "Expense Transaction Number:" + expenseIndex +
                "- Amount: " + amount +
                ", Description: '" + description + '\'' +
                ", Paid to: '" + paidTo + '\'' +
                ", Date: " + date +
                '}';
    }


}
