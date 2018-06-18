/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer_Pattern_2;

import java.util.Observer;
import java.util.Observable;

/**
 *
 * @author test
 */
public class Crickbuzz implements Observer{
    Observable observable;
    
    public Crickbuzz(Observable observable){
        this.observable=observable;
        observable.addObserver(this);
    }
    public void update(Observable obs,Object arg){
        if(obs instanceof Cricket){
            Cricket c = (Cricket)obs;
            System.out.println("Crickbuzz score is "+c.get_Score());
        }
    }
    
}
