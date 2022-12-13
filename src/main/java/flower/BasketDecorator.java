package flower;

import item.Item;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BasketDecorator extends ItemDecorator {
    private Item item;
    public double getPrice() {
        return 4 + item.price();
    }
    @Override
    public double price() {
        return getPrice();
    }
    @Override
    public String getDescription() {
        item.setDescription(item.getDescription() + " + Basket");
        return item.getDescription();
    }
    public static void main(String[] args) {
        Item fl = new Flower(1, "white", 10, 75);
        fl.setDescription("beautiful");
        System.out.println(fl.getDescription());
        System.out.println(fl.price());

        fl = new BasketDecorator(fl);
        System.out.println(fl.getDescription());
        System.out.println(fl.price());
    }
}
