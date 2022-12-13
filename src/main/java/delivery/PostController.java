package delivery;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RequestMapping("/api/v1/post-delivery")
@RestController
public class PostController {
    @GetMapping
    public List<? extends Delivery> getDeliveries() {
        return List.of(new PostDeliveryStrategy());
    }
}
