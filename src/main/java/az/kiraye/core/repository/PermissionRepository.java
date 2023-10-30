package az.kiraye.core.repository;

import az.kiraye.core.model.entity.Permission;

import java.util.List;

public interface PermissionRepository {
    void insert(Permission permission);
    void update(Permission permission);

    void delete(int id);
    Permission findById(int id);
    List<Permission> findAll();
}
