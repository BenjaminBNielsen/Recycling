/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recycling.model;

/**
 *
 * @author benjamin
 */
public class Container implements Comparable<Type>{
    private Type type;

    public Container(Type type) {
        this.type = type;
    }
    
    public Type getType(){
        return type;
    }

    @Override
    public int compareTo(Type o) {
        return this.type.getDescription().compareTo(o.getDescription());
    }
}
