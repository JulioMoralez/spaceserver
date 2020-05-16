package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pack.model.Game;
import pack.service.GameService;

import java.util.List;

@CrossOrigin
@RestController
public class GameController {
    @Autowired
    private GameService gameService;

    static final String URL = "/game";

    @RequestMapping(value = URL + "/{entity}", method = RequestMethod.GET, produces = "application/json")
    public Game find(@PathVariable Game entity){
        return entity;
    }

    @RequestMapping(value = URL + "s", method = RequestMethod.GET, produces = "application/json")
    public List<Game> findAll() {
        return gameService.findAll();
    }

    @RequestMapping(value = URL, method = RequestMethod.POST, consumes = "application/json")
    public Game save(@RequestBody Game entity){
        return gameService.save(entity);
    }

    @RequestMapping(value = URL + "/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public Integer delete(@PathVariable Integer id){
        return gameService.delete(id);
    }
}
