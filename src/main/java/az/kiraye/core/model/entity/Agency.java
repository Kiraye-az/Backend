package az.kiraye.core.model.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Entity(name="agencies")
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Agency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name="agency_name")
    String agencyName;

    @JoinColumn
    @ManyToOne

}
