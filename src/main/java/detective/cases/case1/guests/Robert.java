package detective.cases.case1.guests;

import detective.cases.case1.wines.WhiteWine;
import detective.cases.case1.wines.Glass;

public class Robert<Wine extends WhiteWine> extends William<Wine> {
    public Robert(Glass<Wine> glass) {
        super(glass);
    }
}

