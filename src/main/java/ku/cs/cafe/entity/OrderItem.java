package ku.cs.cafe.entity;
//suwara apaipong[6010405572]
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class OrderItem {

    @EmbeddedId
    private OrderItemKey Id;

    private int quantity;

    @ManyToOne
    @MapsId("orderId")
    @JoinColumn(name = "order_id")
    private PurchaseOrder purchaseOrder;

    @ManyToOne
    @MapsId("menuId")
    @JoinColumn(name = "menu_id")
    private Menu menu;

    public double getSubtotal() {
        return menu.getPrice() * quantity;
    }

}
