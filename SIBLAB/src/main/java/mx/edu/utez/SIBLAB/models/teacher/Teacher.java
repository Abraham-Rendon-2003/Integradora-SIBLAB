package mx.edu.utez.SIBLAB.models.teacher;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.edu.utez.SIBLAB.models.user.User;

import javax.persistence.*;

@Entity
@Table(name = "teachers")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String lastname;


}
