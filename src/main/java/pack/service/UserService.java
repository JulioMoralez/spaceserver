package pack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pack.model.User;
import pack.repository.UserRepo;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User findById(Integer id){
        return userRepo.findById(id).get();
    }

    public List<User> findAll() {
        return userRepo.findAll();
    }

    public User save(User user){
        return userRepo.save(user);
    }

    public Integer delete(Integer id) {
        if (userRepo.findById(id).isPresent()) {
            try {
                userRepo.deleteById(id);
            }
            catch (Exception e){
                return -1;
            }
        }
        return id;
    }
}
