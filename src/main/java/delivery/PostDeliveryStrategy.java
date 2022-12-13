package delivery;

import lombok.Getter;
import lombok.Setter;
import item.Item;

import java.util.LinkedList;

@Getter@Setter
public class PostDeliveryStrategy implements Delivery {
    private String name;
    private String description;

    public PostDeliveryStrategy() {
        name = "Post";
        description = "Post Delivery";
    }
    @Override
    public void deliver(LinkedList<Item> items) {
        LinkedList<Item> toDelete;
        toDelete = items;
        items.removeAll(toDelete);
        System.out.println("Delivery done with post");
    }
}