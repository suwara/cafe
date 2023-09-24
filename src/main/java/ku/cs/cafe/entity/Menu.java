package ku.cs.cafe.entity;
//suwara apaipong[6010405572]
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
public class Menu {
    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    private double price;

    @ManyToOne
    private Category category;
}
