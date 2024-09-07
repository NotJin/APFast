package exam.IASF.APFast.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "members")
public class Member {
    @Id
    @Column(name = "user_id", nullable = false, length = 32)
    private String userId;

    @Column(name = "password", nullable = false, length = 68)
    private String password;

    @Column(name = "is_active", nullable = false)
    private Byte isActive;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roles = new HashSet<>();
}