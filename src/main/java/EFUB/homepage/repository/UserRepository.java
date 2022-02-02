package EFUB.homepage.repository;

import EFUB.homepage.domain.Position;
import EFUB.homepage.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByNameAndPhoneNoAndPassword(String name, String phoneNo, String password);

    User findByNameAndPhoneNo(String name, String phoneNo);
    List<User> findAllByPosition(Position position);
    List<User> findAllByPositionAndPassMid(Position position, Boolean order);

}
