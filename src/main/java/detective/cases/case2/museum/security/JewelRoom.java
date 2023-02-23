package detective.cases.case2.museum.security;

import detective.cases.case2.museum.Visitor;
import detective.cases.case2.museum.security.guards.Guard;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Stream;

@Component
@AllArgsConstructor
public class JewelRoom {

    private final List<Guard> guards;

    public void enter(List<Visitor> visitors) {
        Stream<Visitor> suspiciousVisitors;
        try {
            suspiciousVisitors = visitors.stream().filter(this::guardsCheck);
        } catch (Throwable t) {
            System.out.println("We caught you, De'Lombok");
            return;
        }
        if (suspiciousVisitors.findAny().isPresent()) {
            System.out.println("We caught you, De'Lombok");
        }
    }

    private boolean guardsCheck(Visitor visitor) {
        for (Guard guard : guards) {
            if (guard.isSuspicious(visitor)) return true;
        }
        return false;
    }
}
