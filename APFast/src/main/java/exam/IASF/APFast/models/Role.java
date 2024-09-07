package exam.IASF.APFast.models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "roles")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Role implements Serializable {
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private Member user;

    @Column(name = "role", nullable = false, length = 32)
    private String role;
    @Id
    private Long id;

    public String getName() {
        return "";
    }
}