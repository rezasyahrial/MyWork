package OOP.DiscountSystem;

import java.util.Date;

public class Visit {

    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(String name, Date date){
        name = customer.getName();
        this.date = date;
    }

    public String getName(){
        return customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense(){
        return productExpense+serviceExpense;
    }

    public String toString(){
        return customer.toString() + "Service Expenses : " + serviceExpense + "Product Expenses : " + productExpense;
    }
}
