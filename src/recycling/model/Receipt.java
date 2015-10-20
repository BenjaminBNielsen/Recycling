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
public class Receipt {  
    private String summary;

    public Receipt(String summary) {
        this.summary = summary;
    }
    public String getSummary(){
        return summary;
    }
    
  }
