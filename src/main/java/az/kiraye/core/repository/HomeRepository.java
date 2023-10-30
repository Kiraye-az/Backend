package az.kiraye.core.repository;

import az.kiraye.core.model.entity.Category;
import az.kiraye.core.model.entity.Home;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HomeRepository {
    void insert(Home home);
    void update(Home home);

    void delete(int id);
    Category findById(int id);
    List<Category> findAll();
}
