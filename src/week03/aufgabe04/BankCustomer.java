package week03.aufgabe04;

public class BankCustomer {
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private BankManager manager;

    public BankCustomer(String firstName, String lastName, int age, String address, BankManager manager) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.manager = manager;
    }



    public void printCustomerInfo() {
        System.out.println("Cstmr name\t: " + this.getFirstName() + " " + this.getLastName());
        System.out.println("Cstmr age\t: " + this.getAge());
        System.out.println("Cstmr adres\t: " + this.getAddress());
    }

    public BankAccount openNewAccount() {
        return new BankAccount(this);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public BankManager getManager() {
        return manager;
    }

}
