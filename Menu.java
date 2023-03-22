import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class Menu extends Account {


Scanner scan = new Scanner(System.in);
DecimalFormat dm = new DecimalFormat("####,##");

HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

public void getLogin() throws IOException{
    int x = 1;

    do{
        try{
            data.put(9191,0123);
            data.put(3535, 8080);
            System.out.println("Welcome to First Bank & Friends");
            System.out.println("Please enter your customer number");
            setCustomerNumber(scan.nextInt());
            System.out.println("Please enter your pin");
            setPinNumber(scan.nextInt());

        } catch(Exception e){
            System.out.println("Invalid Characters");

        }

        int custNum = getCustomerNumber();
        int pn = getPinNumber();
        if(data.containsKey(custNum) && data.get(custNum) == pn){
            getAccountType();
        } else{
            System.out.println("Wrong information two attempts left");
        }


    } while(x == 2);
}
        public void getAccountType(){
            System.out.println("Please select from a option below");
            System.out.println("1) Checking");
            System.out.println("2) Saving");
            System.out.println("3) Exit");

            int selection = scan.nextInt();

            switch(selection){
                case 1:
                    getChecking();
                    break;

                case 2:
                    getSaving();
                    break;

                case 3:
                    System.out.println("Thank you for choosing us have a great day");
                    break;
                default:
                    System.out.println("Invalid Choice press 3 to exit");
            }

        }
        public void getChecking(){
            System.out.println("Checking Account Options: ");
            System.out.println("1) - View Balance");
            System.out.println("2) - Withdraw Funds");
            System.out.println("3) - Deposit Funds");
            System.out.println("4) = Exit");
            System.out.println("Choice: ");

            int selection = scan.nextInt();

            switch(selection){
                case 1:
                    System.out.println("Checking Account Balance: " + getCheckingBalance());
                    getAccountType();
                    break;
                case 2:
                    getCehckingWithdrawInput();
                    getAccountType();
                    break;

                case 3:
                    getCheckingDepositInput();
                    getAccountType();
                    break;
                case 4:
                    System.out.println("Thank you for choosing us have a great day");
                    break;
                default:
                    System.out.println("Invalid Choice");
                    getChecking();
            }
        }

        public void getSaving(){
            System.out.println("Saving Account Options: ");
            System.out.println("1) - View Balance");
            System.out.println("2) - Withdraw Funds");
            System.out.println("3) - Deposit Funds");
            System.out.println("4) = Exit");
            System.out.println("Choice: ");

            int selection = scan.nextInt();

            switch(selection){
                case 1:
                    System.out.println("Saving account Balance " + getSavingBalance());
                    getAccountType();
                    break;
                case 2:
                    getSavingWithdrawInput();
                    getAccountType();
                    break;
                case 3:
                    getSavingDepositInput();
                    getAccountType();
                    break;
                case 4:
                    System.out.println("Thank you for choosing us have a great day");
                    break;
                default:
                    System.out.println("Invalid Choice");
                    getChecking();
            }
        }

}
