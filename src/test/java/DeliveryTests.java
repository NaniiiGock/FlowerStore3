import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import delivery.DHLDeliveryStrategy;
import delivery.PostDeliveryStrategy;
import flower.CactusFlower;
import flower.FlowerBucket;
import flower.RomashkaFlower;
import item.Item;

import java.util.LinkedList;

public class DeliveryTests {
    private LinkedList<Item> items;

    @BeforeEach
    public void init() {
        items = new LinkedList<>();
        items.add(new RomashkaFlower(1, "white", 5, 30));
        items.add(new CactusFlower(2, "green", 3, 200));

        FlowerBucket newBucket = new FlowerBucket();
        newBucket.addFlowers(new RomashkaFlower(3, "white", 5, 300));
        newBucket.addFlowers(new CactusFlower(4, "green", 5, 200));

        items.add(newBucket);
    }

    @Test
    public void testDHL() {
        DHLDeliveryStrategy dhlStrategy = new DHLDeliveryStrategy();
        dhlStrategy.deliver(items);
        Assertions.assertEquals(0, items.size());
    }

    @Test
    public void testPost() {
        PostDeliveryStrategy postStrategy = new PostDeliveryStrategy();
        postStrategy.deliver(items);
        Assertions.assertEquals(0, items.size());
    }
}
