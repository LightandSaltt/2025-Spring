package d_aop.b_autoproxy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
            new String[]{"/aop/autoproxy/application-context.xml"});

        Developer man = context.getBean("man", Developer.class);
        Developer woman = context.getBean("woman", Developer.class);
        Developer child = context.getBean("child", Developer.class);

        System.out.println(man instanceof Developer);
        System.out.println(man instanceof Man);
        System.out.println("=====================");

        man.develop();
        System.out.println("=====================");
        woman.develop();
        System.out.println("=====================");

        child.develop();

    }

}
