package kz.kaznitu.lessons.test;


import kz.kaznitu.lessons.test.conf.IOutputConf;
import kz.kaznitu.lessons.test.interfaces.IOutputGenerator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(IOutputConf.class) ;

        IOutputGenerator output = ctx.getBean("outputGenerator",
                IOutputGenerator.class) ;

        output.generateOutput();
    }
}
