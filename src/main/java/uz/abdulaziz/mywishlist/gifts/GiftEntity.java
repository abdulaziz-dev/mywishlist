package uz.abdulaziz.mywishlist.gifts;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import uz.abdulaziz.mywishlist.wishlists.WishlistEntity;

@Getter
@Setter
@Entity
@NoArgsConstructor
@ToString
@Table(name = "gifts")
public class GiftEntity {

  private static final String ID_GENERATOR = "gifts_gen";
  private static final String ID_SEQUENCE = "gifts_seq";

  @Id
  @SequenceGenerator(name = ID_GENERATOR, sequenceName = ID_SEQUENCE, allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = ID_GENERATOR)
  private Long id;

  @Column(length = 120, nullable = false)
  private String title;

  @Column(length = 200)
  private String description;

  @Column(columnDefinition = "TEXT")
  private String image;

  @Column(columnDefinition = "TEXT", nullable = false)
  private String url;

  @Column(name = "quantity")
  private Integer quantity;

  @ManyToOne
  @JoinColumn(name = "wishlist_id", referencedColumnName = "id", nullable = false)
  private WishlistEntity wishlist;

}
