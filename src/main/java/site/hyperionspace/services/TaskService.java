package site.hyperionspace.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.hyperionspace.models.Task;
import site.hyperionspace.repositories.TaskRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TaskService {
    private final TaskRepository taskRepository;
    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    public List<Task> getAllTask() {
        return taskRepository.findAll();
    }

}
