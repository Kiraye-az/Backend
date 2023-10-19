package az.kiraye.core.model.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Entity(name="permissions")
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Permission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name="permission_name")
    String permissionName;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    Role role;



}