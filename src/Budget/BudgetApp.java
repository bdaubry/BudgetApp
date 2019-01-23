package Budget;

import java.util.Scanner;

public class BudgetApp {
    public static Scanner input = new Scanner(System.in);
    public static Account testAcct = new Account("test", "Commerce", "Checking");

    public static void main(String[] args){
        String transType = "";
        double amount;


        while(!transType.equals("quit")){

        System.out.println("Please choose an action:" +
                "\n Expense" +
                "\n Income" +
                "\n Quit");

        transType = input.next().toLowerCase();
        if(transType.equals("expense")){
            System.out.println("How much did it cost?");
            amount = input.nextDouble();
            Expense newExpense = new Expense(amount);
            testAcct.debitTransaction(newExpense);
            System.out.println("Your new account balance is " + testAcct.getBalance());

        } else if (transType.equals("income")){
            System.out.println("How much did you receive?");
            amount = input.nextDouble();
            Income newIncome = new Income(amount);
            testAcct.creditTransaction(newIncome);
            System.out.println("Your new account balance is " + testAcct.getBalance());
        } else if (transType.equals("quit")){
            System.out.println("Your final account balance is " + testAcct.getBalance());
        } else {
            System.out.println("invalid input");
        }
        }
    }
}
