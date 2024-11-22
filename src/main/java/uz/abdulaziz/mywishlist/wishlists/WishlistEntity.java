package uz.abdulaziz.mywishlist.wishlists;

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
@Table(name = "wishlists")
public class WishlistEntity {

  private static final String ID_GENERATOR = "wishlists_gen";
  private static final String ID_SEQUENCE = "wishlists_seq";

  @Id
  @SequenceGenerator(name = ID_GENERATOR, sequenceName = ID_SEQUENCE, allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = ID_GENERATOR)
  private Long id;

  @Column(name = "title", nullable = false)
  private String title;

  @Column(name = "description", columnDefinition = "TEXT")
  private String description;

  private Long createdBy;
}
