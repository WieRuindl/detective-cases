package detective.cases.case2.museum;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Visitor {
    private String name;

    public void setName(String name) {
        if (name.equals("De'Lombok")) {
            throw new SecurityException("We caught you, De'Lombok!");
        }
        this.name = name;
    }
}
