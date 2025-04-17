package d_aop.b_autoproxy;

import org.springframework.stereotype.Component;

@Component
public class Child implements Developer {

    public String develop(){
        // 주관심사만 구현 -> 비즈니스 로직
        System.out.println("아가는 스크래치로 개발한다.");
        throw new RuntimeException("귀여운 실수 발생!");
    }
}
