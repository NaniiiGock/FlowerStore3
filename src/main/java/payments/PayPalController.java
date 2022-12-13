package payments;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RequestMapping("/api/v1/paypal-payment")
@RestController
public class PayPalController {
    @GetMapping
    public List<? extends Payment> getPayments() {
        return List.of(new PayPalPaymentStrategy());
    }
}
