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
    public void makeDonation() {
        Collection<URL> uniqueRareLandscapes = Arrays.asList(
                new URL("http://javapuzzlers.com"),
                new URL("http://seattlehadassah.org")
        );
        System.out.println("Philanthropist: I gift these to the city: " + uniqueRareLandscapes);
        deliveryService.takeLandscapesFromPhilanthropist(uniqueRareLandscapes);
    }

}
