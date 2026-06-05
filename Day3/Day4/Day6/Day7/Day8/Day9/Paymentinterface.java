interface Payment{
    void makePayment();
}
class PhonePe implements Payment{
    public void makePayment() {
        System.out.println("Payment made through PhonePe");
    }
}
class GooglePay implements Payment{
    public void makePayment() {
        System.out.println("Payment made through Google Pay");
    }
}
class Paytm implements Payment{
    public void makePayment() {
        System.out.println("Payment made through Paytm");
    }
}
public class Paymentinterface {
    public static void main(String[] args) {
        Payment P1 = new PhonePe();
        Payment P2 = new GooglePay();
        Payment P3 = new Paytm();
        
        P1.makePayment(); // Calls the makePayment method from PhonePe class
        P2.makePayment(); // Calls the makePayment method from GooglePay class
        P3.makePayment(); // Calls the makePayment method from Paytm class
    }
}
