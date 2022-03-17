/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lleak.helpers;

/**
 *
 * @author tassy
 */
public class ChanProf {
    private int id = 0;
    private int lbound = 0;
    private int rbound = 0;
    private String file = null;

    public ChanProf() {
    }
        
    public ChanProf(int id, int lbound, int rbound, String file) {
        this.id = id;
        this.lbound = lbound;
        this.rbound = rbound;
        this.file = file;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLbound(int lbound) {
        this.lbound = lbound;
    }

    public void setRbound(int rbound) {
        this.rbound = rbound;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public int getId() {
        return id;
    }

    public int getLbound() {
        return lbound;
    }

    public int getRbound() {
        return rbound;
    }

    public String getFile() {
        return file;
    }

    @Override
    public String toString() {
        return ("Id:" + getId() + " LBound:" + getLbound() + " RBound:" + getRbound() + " File:" + getFile());
    }
    
    
    
    
    
    
    
}
