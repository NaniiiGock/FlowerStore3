package flower;
import lombok.Getter;
import lombok.Setter;
import item.Item;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class FlowerBucket extends Item {
    static List<Flower> flower_list = new ArrayList<>();

    public double price() {
        double price = 0;
        for (Flower flower: flower_list) {
            price += flower.price();
        }
        return price;
    }

    public Flower searchFlower(double price) {
        for (Flower flower: flower_list) {
            if (flower.price() == price) {
                return flower;
            }
        }
        return null;
    }

    public static void addFlowers(Flower flower){
        flower_list.add(flower);
    }
}
