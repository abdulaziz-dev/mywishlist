package uz.abdulaziz.mywishlist.users;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@NoArgsConstructor
@ToString
@Table(name = "users")
public class UserEntity {

  private static final String ID_GENERATOR = "users_gen";
  private static final String ID_SEQUENCE = "users_seq";

  @Id
  @SequenceGenerator(name = ID_GENERATOR, sequenceName = ID_SEQUENCE, allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = ID_GENERATOR)
  private Long id;

  @Column(name = "username", length = 50, nullable = false)
  private String username;

  @Column(name = "bio", length = 150)
  private String bio;

  @Column(name = "display_name", length = 100, nullable = false)
  private String displayName;

  @Column(name = "email", length = 100, nullable = false)
  private String email;

  @Column(name = "password", nullable = false)
  private String password;

  @Column(name = "profile_image")
  private String profileImage;

}
