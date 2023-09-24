package ku.cs.cafe.model;
//suwara apaipong[6010405572]
import lombok.Data;

import java.util.UUID;

@Data
public class MenuRequest {
    private String name;
    private UUID categoryId;
    private double price;
}
