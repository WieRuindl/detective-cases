package detectivecases.case4.actors;

import detectivecases.case4.deliveryservice.DeliveryService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.Arrays;
import java.util.Collection;

@Component
@RequiredArgsConstructor
public class Philanthropist {

    private final DeliveryService deliveryService;

    @SneakyThrows
    public String makeDonation() {
        Collection<URL> uniqueRareLandscapes = Arrays.asList(
                new URL("http://javapuzzlers.com"),
                new URL("http://seattlehadassah.org")
        );
        return deliveryService.sendDelivery(uniqueRareLandscapes);
    }

}
