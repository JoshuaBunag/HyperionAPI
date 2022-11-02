package site.hyperionspace.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import site.hyperionspace.models.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
