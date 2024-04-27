package detectivecases.case3.stage;

import detectivecases.case3.aspect.Attention;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Stage implements Watchable {

    private final Box box;

    @PostConstruct
    @PreDestroy
    @Attention
    public final void watchVeryCarefully() {
        System.out.println("Looking in the box: " + box);
    }
}
