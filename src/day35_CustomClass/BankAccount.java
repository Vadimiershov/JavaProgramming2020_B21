package day35_CustomClass;

import java.time.LocalDate;

public class BankAccount {

    public String accountName;
    public String accountNumber;
    public double availableBalance;

    public void setInfo(String acctName, String acctNumber){
        accountName = acctName;
        accountNumber = acctNumber;
    }

    public void getInfo(){
        System.out.println("======================================================================================");
        System.out.println("Date: "+ LocalDate.now());
        System.out.println("Account Name: "+accountName);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Available Balance: "+availableBalance);
        System.out.println("=======================================================================================");
    }

    public void deposit(double amount){
        availableBalance += amount;
    }

    public void withDraw(double amount){
        availableBalance -= amount;
    }

    public void showBalance(){
        System.out.println("As of "+LocalDate.now()+" "+accountName+" available balance is: "+availableBalance);
    }







}
/*BankAccount
        Attributes:
        accountName, accountNumber, availableBalance
        Actions:
        setInfo: sets accountName, accountNumber,
        getInfo:
        deposit:
        wihtdraw:
        showBalance:
*/