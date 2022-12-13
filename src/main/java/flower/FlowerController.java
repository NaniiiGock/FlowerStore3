package flower;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/flower")
@RestController
public class FlowerController {
    private final FlowerService flowerService;
    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping("/all")
    public List<Flower> getFlowers() {
        return flowerService.getFlowers();
    }

    @PostMapping("/add")
    public void addFlower(@RequestBody Flower flower) {
        flowerService.addFlower(flower);
    }
}
