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

    public void receiveDelivery() {
        Safebox safebox = deliveryService.giveLandscapesToMuseum();
        Set<URL> landscapes = safebox.getBriefcases().stream()
                .map(Briefcase::getLandscape)
                .collect(Collectors.toSet());
        String statement =  String.format(
                "We unwrapped these: %s. Safebox sealed: %s",
                landscapes, safebox.isSealed()
        );
        System.out.println("Museum: " + statement);
    }

}
