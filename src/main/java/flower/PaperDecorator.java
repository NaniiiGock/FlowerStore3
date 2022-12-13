package flower;
import item.Item;
import lombok.AllArgsConstructor;
@AllArgsConstructor
public class PaperDecorator extends ItemDecorator {
    private Item item;
    public double getPrice() {
        return 13 + item.price();
    }
    @Override
    public double price() {
        return getPrice();
    }
    @Override
    public String getDescription() {
        item.setDescription(item.getDescription() + " + Paper");
        return item.getDescription();
    }
}
