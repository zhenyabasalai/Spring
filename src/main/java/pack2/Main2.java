package pack2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pack.HelloWorld;

public class Main2 {

        public static void main(String[] args) {

            ApplicationContext context = new AnnotationConfigApplicationContext(AppConfing.class);

            HelloWorld2 bean =  context.getBean("helloWorld2",HelloWorld2.class);
            bean.getMessage();
        }
    }

