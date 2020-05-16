package pack.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import pack.model.User;

import java.util.List;

public interface UserRepo extends CrudRepository<User, Integer> {
    List<User> findAll();
    User findByUsername(String username);
}
