package detectivecases.case1.guests;

import detectivecases.case1.wines.Glass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

public abstract class William<Wine> {
     @Autowired
    private Glass<Wine> glass;

    public William() {
    }
    public William(Glass<Wine> glass) {
        this.glass = glass;
    }

    @EventListener(ContextRefreshedEvent.class) // to trigger a message after a bean was created
    public void drink() {
        System.out.println(getClass().getSimpleName() + " is drinking " + glass.getContent());
    }
}
