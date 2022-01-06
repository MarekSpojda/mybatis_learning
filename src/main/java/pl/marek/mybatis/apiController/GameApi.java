package pl.marek.mybatis.apiController;

import org.springframework.web.bind.annotation.*;
import pl.marek.mybatis.mapper.GameMapper;
import pl.marek.mybatis.model.Game;

import java.util.List;

@RestController
@RequestMapping("/api/games")
public class GameApi {
    private final GameMapper gameMapper;

    public GameApi(GameMapper gameMapper) {
        this.gameMapper = gameMapper;
    }

    @GetMapping
    public List<Game> getAll() {
        return gameMapper.findAll();
    }


    @GetMapping("/id/{id}")
    public Game getOne(@PathVariable Long id) {
        return gameMapper.findById(id);
    }

    @PostMapping
    public void addGame(@RequestBody Game game) {
        gameMapper.insert(game);
    }
}