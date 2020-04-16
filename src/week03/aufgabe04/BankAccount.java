package week03.aufgabe04;

public class BankAccount {

    private static Long uniqueNumber = 0L;
    private Long accountNumber;
    private double balance;
    private BankCustomer customer;

    public BankAccount(BankCustomer customer) {
        this.customer = customer;
        accountNumber = ++uniqueNumber;
        balance = 0;
    }

    public boolean deposit(double depositAmount) {
        if(depositAmount > 0){
            balance += depositAmount;
            System.out.println("Hesabiniza " + depositAmount + " TL yatirildi.");
            return true;
        } else {
            System.out.println("Negatif deger girdiginiz icin para yatirilamadi.");
            return false;
        }

    }

    public boolean withdraw(double withdrawAmount) {
            if (balance > 0 && withdrawAmount <= balance) {
                balance -= withdrawAmount;
                System.out.println("Hesabinizdan " + withdrawAmount + " TL para cekildi.");
                return true;
            } else {
                System.out.println("Hesabinizda yeterli miktarda para bulunmadigindan islem gerceklesmedi.");
                return false;
            }
    }

    public void printAccountInfo(){
        System.out.println("Account No\t: " + this.getAccountNumber());
        System.out.println("Balance\t\t: " + this.getBalance());
        this.customer.printCustomerInfo();
        this.customer.getManager().printManagerInfo();
        System.out.println();
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public BankCustomer getCustomer() {
        return customer;
    }

    public BankManager getManager() {
        return customer.getManager();
    }

}
