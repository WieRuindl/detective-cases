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

    public void takeLandscapesFromPhilanthropist(Collection<URL> landscapes) {
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
    }

    public Safebox giveLandscapesToMuseum() {
        return manager.find(Safebox.class, register.getSafebox().getId());
    }

    public void callToManager(String landscape) {
        System.out.println("Manager: Do we have the landscape " + landscape + "?");
        boolean contains = register.check(landscape);
        System.out.println("Manager: " + contains);
    }
}
