package detectivecases.case4.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.net.URL;

@Entity
@Table(name = "briefcase")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(buildMethodName = "close", builderMethodName = "open")
public class Briefcase {
    @Id
    @GeneratedValue
    @ToString.Exclude
    private Long id;

    private URL landscape;
}
