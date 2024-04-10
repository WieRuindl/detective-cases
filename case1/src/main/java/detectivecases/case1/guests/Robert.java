package detectivecases.case1.guests;

import detectivecases.case1.wines.Glass;
import detectivecases.case1.wines.WhiteWine;

public class Robert<Wine extends WhiteWine> extends William<Wine> {
    public Robert(Glass<Wine> glass) {
        super(glass);
    }
}

