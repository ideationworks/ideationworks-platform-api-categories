package ideation.platform.api.categories;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Range(max = 4294967295L)
    @Column(nullable = false, updatable = false, unique = true)
    private Long id;

    @Column(name = "uuid", updatable = false, nullable = false, unique = true, columnDefinition = "BINARY(16)")
    private UUID uuid;

    private String name;
    private String description;

}
