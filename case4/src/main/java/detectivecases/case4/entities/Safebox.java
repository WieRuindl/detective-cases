package detectivecases.case4.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import java.util.HashSet;
import java.util.Set;

import static jakarta.persistence.FetchType.EAGER;

@Entity
@Table(name = "safebox")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(buildMethodName = "lock", builderMethodName = "open")
public class Safebox {
    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(fetch = EAGER)
    private Set<Briefcase> briefcases = new HashSet<>();

    @ColumnDefault("true")
    private boolean isSealed = true;
}
