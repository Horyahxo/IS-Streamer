
package project;

public interface Payable {

    public static final double VAT = 0.15; //15%

    public abstract double calcPayment();

    public abstract void pay(double amount);

}

