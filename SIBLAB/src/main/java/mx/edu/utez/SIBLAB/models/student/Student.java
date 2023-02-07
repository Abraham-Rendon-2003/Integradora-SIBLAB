package mx.edu.utez.SIBLAB.models.student;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.edu.utez.SIBLAB.models.user.User;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "students")
@Setter
@Getter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String lastname;
    @Column(unique = true)
    private String code;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "users_id",referencedColumnName = "id")
    private User users;

}
