package az.kiraye.core.repository;

import az.kiraye.core.model.entity.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleRepository {
    void insert(Role role);
    void update(Role role);

    void delete(int id);
    Role findById(int id);
    List<Role> findAll();

}
