package DZ.partAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Confing {
    @Bean
    public Russian russian(){
        return new Russian();

    }
    @Bean("message")
    public String getMessage(){
        return "Привет";
    }

    @Bean
    public English english(){
        return new English();

    }
    @Bean("message1")
    public String getMessage1(){
        return "Hello";
    }

    @Bean
    public Belarusian belarusian(){
        return new Belarusian();

    }
    @Bean("message2")
    public String getMessage2(){
        return "Прывітанне";
    }


}
