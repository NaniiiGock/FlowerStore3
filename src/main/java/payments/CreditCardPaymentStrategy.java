package payments;

import lombok.Getter;
import lombok.Setter;
@Getter@Setter
public class CreditCardPaymentStrategy implements Payment{
    private String name;
    private String description;
    public CreditCardPaymentStrategy() {
        name = "Credit card";
        description = "Credit card payment";
    }
    @Override
    public boolean pay(double amount) {
        System.out.println("Paid with Credit card");
        return true;
    }
}
