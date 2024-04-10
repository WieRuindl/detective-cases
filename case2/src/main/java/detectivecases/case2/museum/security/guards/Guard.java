package detectivecases.case2.museum.security.guards;

import detectivecases.case2.museum.Visitor;

public interface Guard {
    boolean isSuspicious(Visitor visitor);
}
