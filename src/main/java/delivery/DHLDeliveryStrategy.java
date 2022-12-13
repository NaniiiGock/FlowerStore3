package delivery;

import lombok.Getter;
import lombok.Setter;
import item.Item;
import java.util.LinkedList;
@Getter
@Setter
public class DHLDeliveryStrategy implements Delivery {
    private String name;
    private String description;
    public DHLDeliveryStrategy() {
        name = "DHL";
        description = "DHL Delivery";
    }
    @Override
    public void deliver(LinkedList<Item> items) {
        LinkedList<Item> toDelete;
        toDelete = items;
        items.removeAll(toDelete);
        System.out.println("Delivery done with DHL");
    }
}