package rent;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedAttributeNode;
import jakarta.persistence.NamedEntityGraph;
import jakarta.persistence.NamedSubgraph;
import jakarta.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Data;
import lombok.ToString;
import member.Member;

@Data
@Entity
@ToString
@NamedEntityGraph(
    name = "rentEntityGraph",
    attributeNodes = {
        @NamedAttributeNode("rentBooks"), @NamedAttributeNode("member")
    },
    subgraphs ={
        @NamedSubgraph(
            name="rentBooks",
            attributeNodes = {
                @NamedAttributeNode("book")
            }
        )
    }
)
public class Rent {
    @Id
    @GeneratedValue
    private Long rentId;
    private String title;
    private LocalDateTime createdAt = LocalDateTime.now();
    private Boolean isReturn = false;
    private Boolean activated = true;

    // FetchType
    //   EAGER : Rent 를 데이터베이스에서 읽어올 때 Member 도 함께 조회
    //   LAZY : default, Rent 가 Member 를 사용하는 시점에서 데이터베이스 조회
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userId")
    private Member member;

    @OneToMany(mappedBy = "rent",
        fetch = FetchType.EAGER,
        cascade = CascadeType.PERSIST) // 연관관계가 아닌 쪽 mappedBy
    private List<RentBook> rentBooks;

    public void addRentBook(RentBook rentBook) {
        rentBooks.add(rentBook);
    }
}