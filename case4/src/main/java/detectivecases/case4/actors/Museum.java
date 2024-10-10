package detectivecases.case4.actors;

import detectivecases.case4.deliveryservice.DeliveryService;
import detectivecases.case4.entities.Briefcase;
import detectivecases.case4.entities.Safebox;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.Set;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class Museum {

    private final DeliveryService deliveryService;

    public String receiveDelivery() {
        Safebox safebox = deliveryService.receiveDelivery();
        Set<URL> landscapes = safebox.getBriefcases().stream()
                .map(Briefcase::getLandscape)
                .collect(Collectors.toSet());
        return String.format("We unwrapped these: %s. Safebox sealed: %s", landscapes, safebox.isSealed());
    }

}
