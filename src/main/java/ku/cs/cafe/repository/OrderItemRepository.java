package ku.cs.cafe.repository;
//suwara apaipong[6010405572]
import ku.cs.cafe.entity.OrderItem;
import ku.cs.cafe.entity.OrderItemKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemKey> {
}
