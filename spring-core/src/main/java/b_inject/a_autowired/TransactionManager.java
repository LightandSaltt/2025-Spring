package b_inject.a_autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TransactionManager {

    @Autowired
    @Qualifier("oracleProperties")
    private JdbcProperties jdbcProperties;

    @Autowired
    private JdbcTemplate jdbcTemplate; // 순환참조

    @Override
    public String toString() {
        return "TransactionManager{" +
            "jdbcProperties=" + jdbcProperties +
            '}';
    }
}
