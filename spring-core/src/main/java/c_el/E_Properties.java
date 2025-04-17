package c_el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class E_Properties {

    // ${} Spring 의 속성값 참조
    // String 반환

    @Value("${lecture.name}")
    private String name;

    @Override
    public String toString() {
        return "E_Properties{" +
            "name='" + name + '\'' +
            '}';
    }
}
