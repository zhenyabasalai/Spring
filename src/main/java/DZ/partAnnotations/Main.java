package DZ.partAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Confing.class);

        System.out.println("Input number language : english - 1, russian - 2 or belarusian - 3.");

        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();

        if (s == 1) {

            English bean = context.getBean("english", English.class);
            bean.getMessage1();


        }  if (s == 2) {
            Russian bean = context.getBean("russian", Russian.class);
            bean.getMessage();

        }  if (s == 3) {

            Belarusian bean = context.getBean("belarusian", Belarusian.class);
            bean.getMessage2();
        } else {
            System.out.println("Input correct language");
        }


    }
}
