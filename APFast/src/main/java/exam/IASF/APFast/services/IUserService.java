package exam.IASF.APFast.services;

import org.springframework.security.core.userdetails.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    User createUser(User user);

    List<User> getAllUsers();

    Optional<User> getUserById(Long userId);

    User updateUser(User user);

    void deleteUser(Long userId);
}
