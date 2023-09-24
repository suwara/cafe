package ku.cs.cafe.repository;
//suwara apaipong[6010405572]
import ku.cs.cafe.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MemberRepository extends JpaRepository<Member, UUID> {
    //SELECT * FROM Member Where username = 'username'
    Member findByUsername(String username);
}
