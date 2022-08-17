package by.example.swimming_pool.boundary.databases.postgre.models.sportmens;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sports_mans")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@NoArgsConstructor
public class Children {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;

    @Column(name = "name")
    String name;

    @Column(name = "date_of_birthday")
    String dateOfBirthday;

    @Column(name = "time")
    Long time;

    public Children(String name, String dateOfBirthday, Long time) {
        this.name = name;
        this.dateOfBirthday = dateOfBirthday;
        this.time = time;
    }
}
