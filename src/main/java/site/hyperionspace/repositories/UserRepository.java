package site.hyperionspace.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import site.hyperionspace.models.User;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, Long> {
    void deleteUserById(Long id);
}
