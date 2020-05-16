package pack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pack.model.Game;
import pack.repository.GameRepo;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepo gameRepo;

    public Game findById(Integer id){
        return gameRepo.findById(id).get();
    }

    public List<Game> findAll() {
        return gameRepo.findAll();
    }

    public Game save(Game user){
        return gameRepo.save(user);
    }

    public Integer delete(Integer id) {
        if (gameRepo.findById(id).isPresent()) {
            try {
                gameRepo.deleteById(id);
            }
            catch (Exception e){
                return -1;
            }
        }
        return id;
    }
}
