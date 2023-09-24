package ku.cs.cafe.entity;
//suwara apaipong[6010405572]
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Entity
public class Category {

    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    @OneToMany(mappedBy = "category")
    List<Menu> menus;
}
