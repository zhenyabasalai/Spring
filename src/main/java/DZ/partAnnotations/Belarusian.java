package DZ.partAnnotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Belarusian {

@Autowired
    private String message2;

    public void getMessage2(){
        System.out.println(message2);
    }
}
