package HackerGround.WEIN.repository;

import HackerGround.WEIN.domain.user.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepsitory extends JpaRepository<Member,Long> {
}
