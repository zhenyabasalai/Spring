package pack2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfing {

    public class AppConfig{

        @Bean
        public HelloWorld2 helloWorld2(){
            return new HelloWorld2();

        }
        @Bean("myMessage")
        public String getMyMessage(){
            return "Hello from annotation";
        }

    }


}
