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
public class SegmentGeom {
    private double w;
    private double h;
    private double s;
    private double xi;
    private int typ;
    private double p1;
    private int p2;
    private int code;
    private int pump;

    public SegmentGeom() {
    }

    public SegmentGeom(double w, double h, double s, double xi, int typ, double p1, int p2, int code, int pump) {
        this.w = w;
        this.h = h;
        this.s = s;
        this.xi = xi;
        this.typ = typ;
        this.p1 = p1;
        this.p2 = p2;
        this.code = code;
        this.pump = pump;
    }

    public void setW(double w) {
        this.w = w;
    }

    public void setH(double h) {
        this.h = h;
    }

    public void setS(double s) {
        this.s = s;
    }

    public void setXi(double xi) {
        this.xi = xi;
    }

    public void setTyp(int typ) {
        this.typ = typ;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public void setP2(int p2) {
        this.p2 = p2;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setPump(int pump) {
        this.pump = pump;
    }

    public double getW() {
        return w;
    }

    public double getH() {
        return h;
    }

    public double getS() {
        return s;
    }

    public double getXi() {
        return xi;
    }

    public int getTyp() {
        return typ;
    }

    public double getP1() {
        return p1;
    }

    public int getP2() {
        return p2;
    }

    public int getCode() {
        return code;
    }

    public int getPump() {
        return pump;
    }

    

    @Override
    public String toString() {
        return ("w:" + w + " h:" + h + " s:" + s + " xi:" + xi + " typ:" + typ + " p1:" + p1 + " p2:" + p2 + " code:" + code + " pump:" + pump); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
    
}
