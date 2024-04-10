package detectivecases.case2.museum.security.guards;

import detectivecases.case2.museum.Visitor;
import detectivecases.case2.museum.security.exceptions.AlarmException;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

@Component
public class SecurityGuard implements Guard {

    @Override
    @SneakyThrows
    public boolean isSuspicious(Visitor visitor) {
        if (visitor.getName().equals("De'Lombok")) {
            throw new AlarmException();
        }
        return false;
    }
}
