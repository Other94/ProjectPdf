package pl.pdf.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.pdf.demo.model.Users;

@Repository
public interface UsersRepo extends JpaRepository<Users, Long> {

}
