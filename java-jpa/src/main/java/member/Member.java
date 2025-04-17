package member;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Data
@Entity
@DynamicInsert
public class Member {
    // 객체에 값을 채워넣는게 실수를 줄여준다.
    @Id
    private String userId;
    private String password;
    private String email;
    private String role = "ROLE_USER";
    private String tel;
    private Boolean activated = true;
    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime rentableDate = LocalDateTime.now().plus(7, ChronoUnit.DAYS);
    
}
