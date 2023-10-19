package az.kiraye.core.model.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {

  Integer id;

  String fullName;

  Role role;

  Agency agency;


}
