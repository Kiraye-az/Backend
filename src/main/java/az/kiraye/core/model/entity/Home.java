package az.kiraye.core.model.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults( level= AccessLevel.PRIVATE)
public class Home {

  Integer id;

  Double area;

  Boolean repair;

  Double floor;

  Integer roomsCount;

  String description;

  Category category;

  Agency agency;

}
