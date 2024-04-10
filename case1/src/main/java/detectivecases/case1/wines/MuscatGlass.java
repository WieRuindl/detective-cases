package detectivecases.case1.wines;

public class MuscatGlass implements Glass<Muscat> {
    @Override
    public Muscat getContent() {
        return new Muscat() {
            @Override
            public String toString() {
                return "Muscat";
            }
        };
    }
}
