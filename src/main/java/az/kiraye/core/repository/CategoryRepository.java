package az.kiraye.core.repository;

import az.kiraye.core.model.entity.Agency;
import az.kiraye.core.model.entity.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryRepository {
    void insert(Category category);
    void update(Category category);

    void delete(int id);
    Category findById(int id);
    List<Category> findAll();
}
