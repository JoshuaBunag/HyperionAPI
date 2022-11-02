package site.hyperionspace.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.hyperionspace.repositories.UserRepository;
import site.hyperionspace.models.User;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class UserService {
    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
      //  user.setId(UUID.fromString(UUID.randomUUID().toString()));
        return userRepository.save(user);
    }

    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
         userRepository.deleteUserById(id);
    }
}
