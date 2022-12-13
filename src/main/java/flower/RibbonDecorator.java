package flower;
import item.Item;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RibbonDecorator extends ItemDecorator {
    private Item item;

    public double getPrice() {
        return 40 + item.price();
    }

    @Override
    public double price() {
        return getPrice();
    }

    @Override
    public String getDescription() {
        item.setDescription(item.getDescription() + " + Ribbon");
        return item.getDescription();
    }
}
