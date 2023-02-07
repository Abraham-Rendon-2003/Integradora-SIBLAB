package mx.edu.utez.SIBLAB.models.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mx.edu.utez.SIBLAB.models.admin.Admin;
import mx.edu.utez.SIBLAB.models.student.Student;
import mx.edu.utez.SIBLAB.models.teacher.Teacher;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String email;
    private String pwd;
    private Long role;

    @OneToOne(mappedBy = "users" )
    private Student students;


}
