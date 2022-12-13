package item;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public abstract class Item {
    private String description;
    public Item(){
    }
    public abstract double price();
}
