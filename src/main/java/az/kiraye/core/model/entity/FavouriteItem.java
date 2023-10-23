package az.kiraye.core.model.entity;

import java.util.ArrayList;
import java.util.List;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FavouriteItem {

  Integer id;

  List<Home> homes = new ArrayList<>();

}
