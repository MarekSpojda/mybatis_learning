package pl.marek.mybatis.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import pl.marek.mybatis.model.Game;

import java.util.List;

@Mapper
public interface GameMapper {
    @Insert("INSERT INTO game (title, author, type) VALUES(#{title}, #{author}, #{type})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(Game game);

    @Select("SELECT id, title, author, type FROM game WHERE id = #{id}")
    Game findById(long id);

    @Select("SELECT id, title, author, type FROM game")
    List<Game> findAll();
}