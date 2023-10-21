package az.kiraye.core.repository;

import az.kiraye.core.model.entity.Agency;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AgencyRepository {

    void insert(Agency agency);
    void update(Agency agency);

    void delete(int id);
    Agency findById(int id);
    List<Agency> findAll();
}
