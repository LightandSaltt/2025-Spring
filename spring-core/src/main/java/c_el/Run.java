package c_el;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.MapPropertySource;

public class Run {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
            new String[]{"/el/application-context.xml"}, false);

        context.refresh();

        Map<String, Object> environmentProperty = new HashMap<>();
        environmentProperty.put("lecture.name", "hanni");
        environmentProperty.put("lecture.age", "20");
        environmentProperty.put("lecture.subject", List.of("java", "spring", "jpa"));
        environmentProperty.put("lecture.progress", Map.of("java", 100, "jpa", 99, "spring", 100));

        // 환경 변수 등록
        MapPropertySource propertySource = new MapPropertySource("A", environmentProperty);
        context.getEnvironment().getPropertySources().addLast(propertySource);


        A_Literal aLiteral = context.getBean("a_Literal", A_Literal.class);
        System.out.println(aLiteral);

        System.out.println("========================================");

        B_Operator bOperator = context.getBean("b_Operator", B_Operator.class);
        System.out.println(bOperator);

        System.out.println("========================================");

        C_BeanRef cBeanRef = context.getBean("c_BeanRef", C_BeanRef.class);
        System.out.println(cBeanRef);

        System.out.println("========================================");

        D_Method dMethod = context.getBean("d_Method", D_Method.class);
        System.out.println(dMethod);

        E_Properties eProperties = context.getBean("e_Properties", E_Properties.class);
        System.out.println(eProperties);
    }

}
