package az.kiraye.core.model.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Entity(name="users")
@FieldDefaults( level= AccessLevel.PRIVATE)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name="full_name")
    String fullName;

    @ManyToOne
    @JoinColumn(referencedColumnName = "role_id")
    Role role;

    @ManyToOne
    @JoinColumn(referencedColumnName = "agency_id")
    Agency agency;


}
