package mx.edu.utez.SIBLAB.models.group;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "groups")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
