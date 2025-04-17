package b_inject.b_constructor;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TransactionManager {

    private JdbcProperties jdbcProperties;
    private JdbcTemplate jdbcTemplate; // 순환참조

    public TransactionManager(@Qualifier("oracleProperties") JdbcProperties jdbcProperties, JdbcTemplate jdbcTemplate) {
        this.jdbcProperties = jdbcProperties;
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public String toString() {
        return "TransactionManager{" +
            "jdbcProperties=" + jdbcProperties +
            ", jdbcTemplate=" + jdbcTemplate +
            '}';
    }
}
