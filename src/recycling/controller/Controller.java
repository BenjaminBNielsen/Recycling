/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recycling.controller;

import java.util.ArrayList;
import java.util.Arrays;
import recycling.model.Container;
import recycling.model.Machine;
import recycling.model.Receipt;
import recycling.model.Type;

/**
 *
 * @author benjamin
 */
public class Controller {
    public static final ArrayList<Type> TYPES = new ArrayList<>(Arrays.asList(new Type("A"), new Type("B"), new Type("C")));
    private static Controller instance;
    private Machine machine;

    private Controller() {
        machine = new Machine();
    }
    
    public Receipt getReceipt(){
        machine.generateReceipt();
        return machine.getReceipt();
    }
    
    public void insert(Container container){
        machine.insert(container);
    }
    
    public static Controller getInstance(){
        if(instance == null){
            instance = new Controller();
        }
        return instance;
    }
}
