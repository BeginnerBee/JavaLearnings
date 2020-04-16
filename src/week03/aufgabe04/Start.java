package week03.aufgabe04;

public class Start {

    public static void main(String[] args) {

        BankManager manager1 = new BankManager("Manager1");
        BankManager manager2 = new BankManager("Manager2");
        BankCustomer customer1 = new BankCustomer("Klara", "Meier", 18, "Address1", manager1);
        BankCustomer customer2 = new BankCustomer("Petra", "Müller", 27, "Address2", manager1);
        BankCustomer customer3 = new BankCustomer("Hans", "Meier", 53, "Address3", manager2);
        BankCustomer customer4 = new BankCustomer("Stefan", "Schmid", 35, "Address4", manager2);


        BankAccount account1 = new BankAccount(customer1);
        account1.printAccountInfo();

        /*Account faarkli bir yolla acildi.*/
        BankAccount account2 = customer1.openNewAccount();
        account2.printAccountInfo();

        BankAccount account3 = new BankAccount(customer2);
        account3.printAccountInfo();

        BankAccount account4 = new BankAccount(customer3);
        account4.printAccountInfo();

        BankAccount account5 = new BankAccount(customer4);
        account5.printAccountInfo();

        //Accounta para 30 TL yatirildi.
        account1.deposit(30);
        account1.printAccountInfo();

        //Accounta negatif deger yatirildi ve islem gerceklestirilmedi.
        account1.deposit(-10);
        account1.printAccountInfo();

        //Accounttan 20 TL cekildi.
        account1.withdraw(20);
        account1.printAccountInfo();

        //Accountan baliyesinden fazla miktarda para cekilmek istendi ve islem gerceklesmedi.
        account1.withdraw(20);
        account1.printAccountInfo();

    }
}
