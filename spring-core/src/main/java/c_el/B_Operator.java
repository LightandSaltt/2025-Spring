package c_el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class B_Operator {

    @Value("#{10+20}")
    private int add;

    @Value("#{10/20}")
    private int div;

    @Value("#{10 == 10}")
    private boolean equal;

    @Value("#{10 > 20}")
    private boolean bigger;

    @Value("#{true or false}")
    private boolean or;

    @Value("#{!true}")
    private boolean notTrue;

    @Override
    public String toString() {
        return "B_Operator{" +
            "add=" + add +
            ", div=" + div +
            ", equal=" + equal +
            ", bigger=" + bigger +
            ", or=" + or +
            ", notTrue=" + notTrue +
            '}';
    }
}
