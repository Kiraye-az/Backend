package az.kiraye.core.repository;

import az.kiraye.core.model.entity.User;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface UserRepository {

    void insertUser(User user);
    void updateUser(User user);
    void deleteUserById(Integer id);
    User findUserById(Integer id);
    User findUserByEmail(String email);
    List<User> findAllUsers();

}
