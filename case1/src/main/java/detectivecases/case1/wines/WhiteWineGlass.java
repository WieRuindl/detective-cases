package detectivecases.case1.wines;

/*
* contains strong allergic component
* */
public class WhiteWineGlass implements Glass<WhiteWine> {
    @Override
    public WhiteWine getContent() {
        return new WhiteWine() {
            @Override
            public String toString() {
                return "White Wine";
            }
        };
    }
}
