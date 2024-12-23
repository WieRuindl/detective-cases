package detectivecases.case4.actors;

import detectivecases.case4.deliveryservice.DeliveryService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Journalists {

    private final DeliveryService deliveryService;
    private final Philanthropist philanthropist;
    private final Museum museum;

    @EventListener(ContextRefreshedEvent.class)
    public void writeAnArticle() {
        System.out.println("The philanthropist makes a donation:");
        philanthropist.makeDonation();

        System.out.println("Museum receives the delivery:");
        museum.receiveDelivery();

        System.out.println("Calling to manager to ask if they have the missing painting:");
        deliveryService.callToManager("http://javapuzzlers.com");
    }

}
