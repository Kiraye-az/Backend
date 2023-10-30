package az.kiraye.core.repository;

import az.kiraye.core.model.entity.Category;
import az.kiraye.core.model.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserRepository {
    void insert(User user);
    void update(User user);

    void delete(int id);
    Category findById(int id);
    List<Category> findAll();


}
