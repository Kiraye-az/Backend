package az.kiraye.core.model.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity(name="favorite_items")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FavouriteItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @OneToMany
    @JoinColumn(referencedColumnName = "home_id")
    List<Home> homes=new ArrayList<>();




}
