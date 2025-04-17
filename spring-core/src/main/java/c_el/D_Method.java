package c_el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class D_Method {

    @Value("#{'hello'.toUpperCase()}")
    private String upperCase;

    // static method 호출
    @Value("#{T(java.lang.Math).random()}")
    private double random;

    @Value("#{transactionManager.connect()}")
    private String connect;

    @Override
    public String toString() {
        return "D_Method{" +
            "upperCase='" + upperCase + '\'' +
            ", random=" + random +
            ", connect='" + connect + '\'' +
            '}';
    }
}
