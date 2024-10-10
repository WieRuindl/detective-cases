package detectivecases.case4.deliveryservice;

import detectivecases.case4.entities.Briefcase;
import detectivecases.case4.entities.Safebox;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Getter
@Setter
public class DeliveryRegister {
    private Safebox safebox;
    private Map<String, Briefcase> briefcases = new HashMap<>();
}
