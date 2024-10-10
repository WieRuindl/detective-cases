package detectivecases.case4.deliveryservice;

import detectivecases.case4.entities.Briefcase;
import detectivecases.case4.entities.Safebox;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.net.URL;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service
@Transactional
@RequiredArgsConstructor
public class DeliveryService {

    private final EntityManager manager;
    private final DeliveryRegister register;

    public String sendDelivery(Collection<URL> landscapes) {
        Set<Briefcase> briefcases = new HashSet<>();
        for (URL landscape : landscapes) {
            Briefcase briefcase = Briefcase.open().landscape(landscape).close();
            briefcases.add(briefcase);
            register.getBriefcases().put(briefcase.getLandscape().toString(), briefcase);
            manager.persist(briefcase);
        }

        Safebox safebox = Safebox.open().briefcases(briefcases).lock();
        manager.persist(safebox);
        register.setSafebox(safebox);

        return String.format("Safebox with briefcases: %s sent to museum", safebox.getBriefcases());
    }

    public Safebox receiveDelivery() {
        return manager.find(Safebox.class, register.getSafebox().getId());
    }

    public boolean callToManager(String landscape) {
        Safebox safebox = register.getSafebox();
        Briefcase briefcase = register.getBriefcases().get(landscape);
        return safebox.getBriefcases().contains(briefcase);
    }
}
