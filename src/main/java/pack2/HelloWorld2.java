package pack2;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloWorld2 {
    @Autowired
    private String myMessage;

    public void getMessage(){
        System.out.println(myMessage);
    }

}

