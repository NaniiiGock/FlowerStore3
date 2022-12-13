package flower;

import item.Item;
import lombok.AllArgsConstructor;
@AllArgsConstructor
public abstract class ItemDecorator extends Item {
    public abstract String getDescription();
}
