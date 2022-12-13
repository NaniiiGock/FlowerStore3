package order;
import delivery.Delivery;
import item.Item;
import payments.Payment;
import java.util.LinkedList;

public class Order {
    private LinkedList<Item> items;
    private Payment payment;
    private Delivery delivery;

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
        System.out.println("Payment by " + payment.getClass().getSimpleName());
    }
    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
        System.out.println("Payment by " + delivery.getClass().getSimpleName());
    }
    public double calculateTotalPrice() {
        double pr = 0;
        for (Item item: items) {
            pr += item.price();
        }
        return pr;
    }

    public void processOrder() {
        if (payment.pay(calculateTotalPrice())) {
            delivery.deliver(items);
            System.out.println("paid and delivered");
        }
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public Item removeItem(Item item) {
        items.remove(item);
        return item;
    }
}
