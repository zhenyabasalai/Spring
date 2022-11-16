package DZ.partAnnotations;

import org.springframework.beans.factory.annotation.Autowired;

public class English {
@Autowired
    private String message1;

    public void getMessage1(){
        System.out.println(message1);
    }
}
