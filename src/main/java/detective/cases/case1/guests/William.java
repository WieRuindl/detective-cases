package detective.cases.case1.guests;

import detective.cases.case1.wines.Glass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.*;

public class William<Wine> {
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
