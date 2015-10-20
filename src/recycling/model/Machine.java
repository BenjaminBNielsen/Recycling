/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recycling.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.TreeMap;

/**
 *
 * @author benjamin
 */
public class Machine {
    private double payAmount;
    private int returnAmount;
    private Receipt receipt;
    private TreeMap<Integer, Container> containers;

    public Machine() {
        containers = new TreeMap<>();
    }

    public void generateReceipt() {
        String summary = "";

        for (int i = 0; i < containers.size(); i++) {
            summary += containers.get(i) + "\n";
        }
        
        summary += "flasker x " + returnAmount + "\n";
        summary += "cash: " + payAmount;

        receipt = new Receipt(summary);
    }

    public void insert(Container container) {
        returnAmount++;

        containers.put(containers.size(), container);
    }

    public Receipt getReceipt() {
        return receipt;
    }
    
    public void reset(){
        returnAmount = 0;
        payAmount = 0;
        containers.clear();
    }
    
}
