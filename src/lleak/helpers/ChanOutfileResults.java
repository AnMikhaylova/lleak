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
public class ChanOutfileResults {

    private double t;
    private int j;
    private double x;
    private double u;
    private double eps1;
    private double eps2;
    private double eps3;
    private double T1;
    private double T2;
    private double T3;
    private double p;
    private double urho;    
    private double rho;
    private double rho1;
    private double rho2;
    private double rho3;
    private double gsrc;
    private double sigma1nu;
    private double a1;
    private double a7;

    public ChanOutfileResults() {
    }

    public ChanOutfileResults(double t, int j, double x, double u, double eps1, double eps2, double eps3, double T1, double T2, double T3, double p, double urho, double rho, double rho1, double rho2, double rho3, double gsrc, double sigma1nu, double a1, double a7) {
        this.t = t;
        this.j = j;
        this.x = x;
        this.u = u;
        this.eps1 = eps1;
        this.eps2 = eps2;
        this.eps3 = eps3;
        this.T1 = T1;
        this.T2 = T2;
        this.T3 = T3;
        this.p = p;
        this.urho = urho;
        this.rho = rho;
        this.rho1 = rho1;
        this.rho2 = rho2;
        this.rho3 = rho3;
        this.gsrc = gsrc;
        this.sigma1nu = sigma1nu;
        this.a1 = a1;
        this.a7 = a7;
    }

    public void setT(double t) {
        this.t = t;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setU(double u) {
        this.u = u;
    }

    public void setEps1(double eps1) {
        this.eps1 = eps1;
    }

    public void setEps2(double eps2) {
        this.eps2 = eps2;
    }

    public void setEps3(double eps3) {
        this.eps3 = eps3;
    }

    public void setT1(double T1) {
        this.T1 = T1;
    }

    public void setT2(double T2) {
        this.T2 = T2;
    }

    public void setT3(double T3) {
        this.T3 = T3;
    }

    public void setP(double p) {
        this.p = p;
    }

    public void setUrho(double urho) {
        this.urho = urho;
    }

    public void setRho(double rho) {
        this.rho = rho;
    }

    public void setRho1(double rho1) {
        this.rho1 = rho1;
    }

    public void setRho2(double rho2) {
        this.rho2 = rho2;
    }

    public void setRho3(double rho3) {
        this.rho3 = rho3;
    }

    public void setGsrc(double gsrc) {
        this.gsrc = gsrc;
    }

    public void setSigma1nu(double sigma1nu) {
        this.sigma1nu = sigma1nu;
    }

    public void setA1(double a1) {
        this.a1 = a1;
    }

    public void setA7(double a7) {
        this.a7 = a7;
    }

    public double getT() {
        return t;
    }

    public int getJ() {
        return j;
    }

    public double getX() {
        return x;
    }

    public double getU() {
        return u;
    }

    public double getEps1() {
        return eps1;
    }

    public double getEps2() {
        return eps2;
    }

    public double getEps3() {
        return eps3;
    }

    public double getT1() {
        return T1;
    }

    public double getT2() {
        return T2;
    }

    public double getT3() {
        return T3;
    }

    public double getP() {
        return p;
    }

    public double getUrho() {
        return urho;
    }

    public double getRho() {
        return rho;
    }

    public double getRho1() {
        return rho1;
    }

    public double getRho2() {
        return rho2;
    }

    public double getRho3() {
        return rho3;
    }

    public double getGsrc() {
        return gsrc;
    }

    public double getSigma1nu() {
        return sigma1nu;
    }

    public double getA1() {
        return a1;
    }

    public double getA7() {
        return a7;
    }
    
      
    @Override
    public String toString() {
        return ("t:" + t + " j:" + j + " x:" + x + " u:" + u + " eps1:" + eps1 + " eps2:" + eps2 + " eps3:" + eps3 + " T1:" + T1 + " T2:" + T2+ " T3:" + T3 + " p:" + p + " urho:" + urho + " rho:" + rho + " rho1:" + rho1 + " rho2:" + rho2 + " rho3:" + rho3 + " gsrc:" + gsrc + " sigma1nu:" + sigma1nu + " a1:" + a1 + " a7:" + a7); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
