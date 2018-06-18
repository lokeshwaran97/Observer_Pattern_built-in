/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer_Pattern_2;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author test
 */
public class Live implements Observer {
    
    Observable observable;
    public Live(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }
    
    public void update(Observable obs,Object arg){
        if(obs instanceof Cricket){
            Cricket cr = (Cricket)obs;
            System.out.println("Live score is "+cr.get_Score());
        }
    }
}
