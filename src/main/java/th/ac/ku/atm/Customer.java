package th.ac.ku.atm;

public class Customer {
    private int id;
    private String name;
    private int pin;
    private BankAccount account;

    public Customer(int id, String name, int pin) {
        this(id,name,pin,0);
    }

    public Customer(int id, String name, int pin, double balance) {
        this.id = id;
        this.name = name;
        this.pin = pin;
        this.account = new BankAccount(id,name,balance);
    }
    /**
     * Tests if this customer matches a customer number
     * and PIN.
     * @param inputPin a personal identification number
     * @return true if the customer number and PIN match
     */

    public boolean checkPin(int inputPin) {
        return pin == inputPin;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    /**
     * Gets the account of this customer.
     * @return the account
     */
    public BankAccount getAccount() {
        return account;
    }

    public void setName(String name) {
        this.name = name;
    }
}
