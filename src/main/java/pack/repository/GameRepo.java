package pack.repository;

import org.springframework.data.repository.CrudRepository;
import pack.model.Game;

import java.util.List;

public interface GameRepo  extends CrudRepository<Game, Integer> {
    List<Game> findAll();
}
