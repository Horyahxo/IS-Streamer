package project;

public class Subscription implements Payable {

    private final int ID;
    private User User;
    private Date date;
    private int months;
    private Payment payment;
    private String status;

    public Subscription() {
        this(null, null, 0, null);
    }

    public Subscription(User User, Date date, int months, Payment payment) {
        this.ID = generateId();
        setDate(date);
        setUser(User);
        setMonths(months);
        setPayment(payment);
        setStatus("Not confirmed!");
    }

    private int generateId() {
        int num = (int) (1000 + Math.random() + 1); //1...1000
        return num;
    }

    public int getID() {
        return ID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getClient() {
        return User;
    }

    public void setUser(User User) {
        this.User = User;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void pay(double amount) {
        System.out.printf("Pay %.2f SAR\n with: ", amount, getPayment());
    }

    @Override
    public double calcPayment() {

        double price;
        int months = getMonths();
        if (months == 1) {
            price = 40;
        } else if (months >= 2 && months <= 3) {
            price = 60;
        } else {
            price = 100;
        }

        //VAT
        price += price * Payable.VAT;
        return price;
    }

    public final void confirm() {
        double amount = calcPayment();
        pay(amount);
        setStatus("Confirmed");
        System.out.println("Your subscription has been confirmed!");

    }

    public final void print() {
        System.out.println("*** Subscription Info ***");
        System.out.println("Subscription Id: " + getID());
        System.out.println("Subscription Client: " + getClient());
        System.out.println("Subscription Date: " + getDate());
        System.out.println("Months: " + getMonths());
        System.out.println("Subscription Payment:\n " + getPayment());
        System.out.println("Subscription Status: " + getStatus());
        System.out.printf("Total: %.2f SAR\n", calcPayment());
    }

    @Override
    public String toString() {
        return String.format("ID: %d\nClient: %s\nStatus: %s", getID(), getClient(), getStatus());
    }
}
