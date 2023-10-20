package az.kiraye.core.model.entity;

import jakarta.persistence.*;
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


    Integer numberCount;


    String description;

    @ManyToOne
    @JoinColumn(referencedColumnName = "category_id") //?
    private Category category;

    @ManyToOne
    @JoinColumn(referencedColumnName = "agency_id")
    Agency agency;

}
