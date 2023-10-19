package az.kiraye.core.model.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@Entity(name="homes")
@FieldDefaults( level= AccessLevel.PRIVATE)
public class Home {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    Double area;

    Boolean repair;

    Double floor;

    @Column(name="rooms_count")//?
    Integer numberCount;

    @Column(name="description")
    String description;

    @ManyToOne
    @JoinColumn(referencedColumnName = "category_id") //?
    private Category category;

    @ManyToOne
    @JoinColumn(referencedColumnName = "agency_id")
    Agency agency;

}
