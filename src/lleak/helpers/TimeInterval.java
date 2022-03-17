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
public class TimeInterval {
    
    private int nstep = 0;
    private double tau = 0;
    private double cfl = 0;

    public TimeInterval() {
    }

    public TimeInterval(int nstep, double tau, double cfl) {
        this.nstep = nstep;
        this.tau = tau;
        this.cfl = cfl;
    }

    public void setNstep(int nstep) {
        this.nstep = nstep;
    }

    public void setTau(double tau) {
        this.tau = tau;
    }

    public void setCfl(double cfl) {
        this.cfl = cfl;
    }
    
    
    public int getNstep() {
        return nstep;
    }

    public double getTau() {
        return tau;
    }

    public double getCfl() {
        return cfl;
    }

    @Override
    public String toString() {
        return ("Nstep:" + getNstep() + " Tau:" + getTau() + " Cfl:" + getCfl());
    }
    
    
  
    
    
  
}
