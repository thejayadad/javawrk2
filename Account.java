import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;

    Scanner scan = new Scanner(System.in);

    DecimalFormat dm = new DecimalFormat("####,##");

    public int setCustomerNumber(int customerNumber){
        this.customerNumber = customerNumber;
        return customerNumber;
    }

    public int getCustomerNumber(){
        return customerNumber;
    }

    public int setPinNumber(int pinNumber){
        this.pinNumber = pinNumber;
        return pinNumber;
    }
    public int getPinNumber(){
        return pinNumber;
    }
    public double getCheckingBalance(){
        return checkingBalance;
    }

    public double getSavingBalance(){
        return savingBalance;
    }

    public double calcCheckingWithdraw(double amount){
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }
    public double calcSavingWithdraw(double amount){
        savingBalance = (savingBalance - amount);
        return savingBalance;
    }

    public double calcCheckingDeposit(double amount){
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }

    public double calcSavingDeposit(double amount){
        savingBalance = (savingBalance + amount);
            return savingBalance;
    }
    public void getCehckingWithdrawInput(){
        System.out.println("Checking Account Balance: " + checkingBalance);
        System.out.println("Please enter your Withdrawl Amount ");
        double amount = scan.nextDouble();


        if((checkingBalance - amount ) >= 0){
            calcCheckingWithdraw(amount);
            System.out.println("=============================================");
            System.out.println("Withdrawl Complete");
            System.out.println("New Checking Account Balance: " + checkingBalance);
        } else {
            System.out.println("Insufficient Funds");
        }
    }

    public void getSavingWithdrawInput(){
        System.out.println("Saving Account Balance: " + savingBalance);
        System.out.println("Please enter your Withdrawl Amount ");
        double amount = scan.nextDouble();

        if((savingBalance - amount) >= 0){
            calcSavingWithdraw(amount);
            System.out.println("=============================================");
            System.out.println("Withdrawl Complete");
            System.out.println("New Saving Account Balance: " + savingBalance);
        }
    }
    public void getCheckingDepositInput(){
        System.out.println("Checking Account Balance: " + checkingBalance);
        System.out.println("Please enter your deposit amount");
        double amount = scan.nextDouble();

        if((checkingBalance + amount) >=0){
            calcCheckingDeposit(amount);
            System.out.println("=============================================");
            System.out.println("Deposit Complete");
            System.out.println("Current Checking Balance: " + checkingBalance);
        } else {
            System.out.println("Please see a bank teller");
        }
    }

    public void getSavingDepositInput(){
        System.out.println("Saving Account Balance: " + savingBalance);
        System.out.println("Please enter your deposit amount");
        double amount = scan.nextDouble();

        if((savingBalance + amount) >= 0){
            calcSavingDeposit(amount);
            System.out.println("=============================================");
            System.out.println("Current Saving Balance: " + savingBalance);
            System.out.println("Deposit Complete");
        } else {
            System.out.println("Please see a bank teller");
        }
    }
}
