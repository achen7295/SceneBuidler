package sample;

import javafx.event.ActionEvent;

public class Controller {
    int count = 0;
    public void pressButton(ActionEvent event){
        System.out.println("Bam Banch");
        count++;
        System.out.println(count);
    }
}
