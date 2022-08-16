package by.example.swimming_pool.boundary.databases.postgre.models.sportmens;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Table(name = "sportmens")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@NoArgsConstructor
public class Children {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;

    @Column(name = "name")
    String name;

    @Column(name = "time")
    Long time;

    public Children(String name, Long time) {
        this.name = name;
        this.time = time;
    }
}
