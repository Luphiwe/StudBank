/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adp2_group8;

/**
 *
 * @author CPUT
 */
public class StudBank {
  
    private String studName, id, bankName;

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public String toString() {
        return "StudBank{" + "studName=" + studName + ", id=" + id + ", bankName=" + bankName + '}';
    }
    
    
   
}
