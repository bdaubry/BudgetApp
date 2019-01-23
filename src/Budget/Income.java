package Budget;

import java.util.Date;

public class Income {
    private final int incomeIndex;
    private int nextIndexVal = 1;
    private double amount;
    private String description;
    private boolean isRepeating;
    private int repeatInterval;
    private Date date;

    public Income(double amount){
        this.incomeIndex = nextIndexVal;
        nextIndexVal ++;
        this.amount = amount;
        this.description = "No description";
        this.isRepeating = false;
        this.date = new Date();
    }

    public Income(double amount, String description){
        this.incomeIndex = nextIndexVal;
        nextIndexVal ++;
        this.amount = amount;
        this.description = description;
        this.isRepeating = false;
        this.date = new Date();
    }

    public Income(double amount, String description, boolean isRepeating, int repeatInterval, Date date) {
        this.incomeIndex = nextIndexVal;
        nextIndexVal ++;
        this.amount = amount;
        this.description = description;
        this.isRepeating = isRepeating;
        this.repeatInterval = repeatInterval;
        this.date = date;
    }

    public int getIncomeIndex() {
        return incomeIndex;
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

    public boolean isRepeating() {
        return isRepeating;
    }

    public void setRepeating(boolean repeating) {
        isRepeating = repeating;
    }

    public int getRepeatInterval() {
        return repeatInterval;
    }

    public void setRepeatInterval(int repeatInterval) {
        this.repeatInterval = repeatInterval;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
