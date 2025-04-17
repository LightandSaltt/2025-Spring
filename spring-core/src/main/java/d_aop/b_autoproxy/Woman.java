package d_aop.b_autoproxy;

import org.springframework.stereotype.Component;

@Component
public class Woman implements Developer {

    public String develop(){
        System.out.println("여자는 JS로 개발한다.");
        return "Woman";
    }
}
