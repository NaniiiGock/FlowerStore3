import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import flower.CactusFlower;
import flower.Flower;
import flower.FlowerBucket;
import flower.RomashkaFlower;
import flower.BasketDecorator;
import flower.PaperDecorator;
import flower.RibbonDecorator;
import item.Item;


public class DecoratorTests {
    private Item item;
    private Item flowerBucket;

    @BeforeEach
    public void init() {
        item = new Flower(1, "red", 10, 50);
        item.setDescription("red flower");

        flowerBucket = new FlowerBucket();
        FlowerBucket.addFlowers(new RomashkaFlower(2, "white", 7, 30));
        FlowerBucket.addFlowers(new CactusFlower(3, "green", 40, 200));
        flowerBucket.setDescription("first bucket");
    }

    @Test
    public void testBasketDecorator() {
       item = new BasketDecorator(item);
       Assertions.assertEquals("red flower + Basket", item.getDescription());
       flowerBucket = new BasketDecorator(flowerBucket);
       Assertions.assertEquals("first bucket + Basket", flowerBucket.getDescription());
    }

    @Test
    public void testPaperDecorator() {
        item = new PaperDecorator(item);
        Assertions.assertEquals("red flower + Paper", item.getDescription());

        flowerBucket = new PaperDecorator(flowerBucket);
        Assertions.assertEquals("first bucket + Paper", flowerBucket.getDescription());
    }

    @Test
    public void testRibbonDecorator() {
        item = new RibbonDecorator(item);
        Assertions.assertEquals("red flower + Ribbon", item.getDescription());

        flowerBucket = new RibbonDecorator(flowerBucket);
        Assertions.assertEquals("first bucket + Ribbon", flowerBucket.getDescription());
    }
}
