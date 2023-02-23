package detective.cases.case2.museum;

import detective.cases.case2.museum.security.JewelRoom;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/museum")
public class Museum {

    private final JewelRoom jewelRoom;

    @PostMapping("/jewel-room")
    public String enterJewelRoom(@RequestBody List<Visitor> visitors) {
        try {
            jewelRoom.enter(visitors);
            return "Everything is fine";
        } catch (RuntimeException e) {
            return "We caught you, De'Lombok!";
        }
    }
}
