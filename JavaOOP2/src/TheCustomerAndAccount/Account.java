package TheCustomerAndAccount;

public class Account {

    private int id;
    private Customer customer;
    private double balance;

    Account(int id, Customer customer, double balance){
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    Account(int id, Customer customer){
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString(){
        return customer.toString() + "balance=$%03d.%02d" + balance;
    }

    public String getCustomerName(){
        return customer.getName();
    }


}
