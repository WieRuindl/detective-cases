package detective.cases.case2.museum.security.guards;

import detective.cases.case2.museum.Visitor;

public interface Guard {
    boolean isSuspicious(Visitor visitor);
}
