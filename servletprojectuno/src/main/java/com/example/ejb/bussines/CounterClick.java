package com.example.ejb.bussines;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;

/**
 * Session Bean implementation class CounterClick
 */
@Stateful
@LocalBean
public class CounterClick {

	private int clicks;
    /**
     * Default constructor. 
     */
    public CounterClick() {
    	System.out.println("Constructor CounterClick");
    }

    public void doClick(){
    	clicks++;
    }
    
    public int getClicks(){
    	return clicks;
    }
    
}
