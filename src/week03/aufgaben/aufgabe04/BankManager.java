package week03.aufgaben.aufgabe04;

public class BankManager {
    private static Long uniqueNumber = 0L;
    private long internalId;
    private String name;

    public BankManager(String name) {
        internalId = ++uniqueNumber;
        this.name = name;
    }

    public void printManagerInfo(){
        System.out.println("Mngr Id\t\t: " + this.internalId);
        System.out.println("Mngr name\t: " + this.name);
    }

}
