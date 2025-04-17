package a_regist.b_annotation.configuration;

import a_regist.b_annotation.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    // @Bean : 메서드가 반환하는 객체를 spring container 에 bean 으로 등록

    @Bean
    public Book harryPotter() {
        return new Book("해리포터", "조앤롤링", "황금가지", 700);
    }

    @Bean
    public Book demonSlayer() {
        return new Book("귀멸의 칼날", "고토 고요히게", "귀칼사", 300);
    }

}
