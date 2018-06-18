/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer_Pattern_2;

import java.util.Observable;
import java.util.Observer;

public class Cricket extends Observable{
    protected int score;
    
    public int get_Score(){
        return score;
    }
    
    public void change(){
     setChanged();
     notifyObservers();
     
    }
    
    public void set_score(int score){
        this.score = score;
        change();
    }
    
    
    
}
