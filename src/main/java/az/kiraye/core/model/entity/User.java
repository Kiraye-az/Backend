package az.kiraye.core.model.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.sql.Timestamp;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {

  Integer id;

  String firstName;

  String lastName;

  String email;

  String password;

  Timestamp createdAt;

  Timestamp updatedAt;

  Boolean isActive;

  Integer roleId;
}
