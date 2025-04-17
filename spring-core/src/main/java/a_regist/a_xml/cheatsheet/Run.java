package a_regist.a_xml.cheatsheet;

import a_regist.a_xml.bean.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext(
            "/regist/xml/cheatsheet/application-context.xml"
        );


    }
}