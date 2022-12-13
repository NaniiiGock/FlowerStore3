package payments;

import lombok.Getter;
import lombok.Setter;
@Getter@Setter
public class PayPalPaymentStrategy implements Payment{
    private String name;
    private String description;
    public PayPalPaymentStrategy() {
        name = "Paypal";
        description = "PayPal";
    }
    @Override
    public boolean pay(double amount) {
        System.out.println("Paid with PayPal");
        return true;
    }
}
