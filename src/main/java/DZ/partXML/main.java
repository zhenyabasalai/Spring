package DZ.partXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pack.HelloWorld;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");


        System.out.println("Input number language : english - 1, russian - 2 or belarusian - 3.");

        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        if (s == 1) {
            English bean = (English) context.getBean("Language1");
            bean.getMessage();
        }
        if (s == 2) {
            Russian bean = (Russian) context.getBean("Language2");
            bean.getMessage();
        }
        if (s == 3) {
            Belarusin bean = (Belarusin) context.getBean("Language");
            bean.getMessage();
        }
    }
}
