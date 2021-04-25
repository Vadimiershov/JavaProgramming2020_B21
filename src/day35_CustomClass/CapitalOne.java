package day35_CustomClass;

public class CapitalOne {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();

        account1.setInfo("Saidullo", "12345678976");

        account1.getInfo();

        account1.deposit(100);

        account1.withDraw(30);

        account1.showBalance();

        BankAccount account2 = new BankAccount();

        account2.setInfo("Walid","34549274825");

        account2.deposit(200);

        account2.showBalance();




    }



}
