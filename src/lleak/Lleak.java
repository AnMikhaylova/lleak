/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lleak;


import java.util.ArrayList;
import lleak.helpers.*;

/**
 *
 * @author tassy
 */
public class Lleak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


//        BoundsReader br = new BoundsReader(rootDir + cr.getBounds());
//        Map<Integer, String> y = br.getBoundFiles();
//
//        for (Map.Entry entry : y.entrySet()) {
//            System.out.println("Key: " + entry.getKey() + " Value: "
//                    + entry.getValue());
//        }

        String rootDir = "example/";

        ConfReader cr = new ConfReader(rootDir + "mainconf.txt");
        
        System.out.println("\n--------Timescen-----------");

        TimeReader tr = new TimeReader(rootDir + cr.getTime());
        ArrayList<TimeInterval> timeIntervals = tr.getTimeIntervals();
        System.out.println("Nt:" + tr.getNt());
        timeIntervals.forEach(s -> System.out.println(s.toString()));
        
        System.out.println("\n--------ChanProf-----------");
        ChanProfReader cpr = new ChanProfReader(rootDir + cr.getChan());
        ArrayList<ChanProf> al = cpr.getChans();
        System.out.println("N:" + cpr.getN());
        al.forEach(c -> System.out.println(c.toString()));
        
        System.out.println("\n--------ch1.txt-----------");
        ChanTxtReader ctr = new ChanTxtReader(rootDir + cpr.getChans().get(0).getFile());
        System.out.println(ctr.toString());

        System.out.println("\n--------geom1.txt-----------");
        GeomReader gr = new GeomReader(rootDir + ctr.getGeom());
        ArrayList<SegmentGeom> segmentGeoms = gr.getSegmentGeoms();
        System.out.println("N:"+ gr.getNSegments());
        segmentGeoms.forEach(c -> System.out.println(c.toString()));
        
        System.out.println("--------ch1-----------");
        ChanOutfileReader cor = new ChanOutfileReader(rootDir + ctr.getOutfile());
        System.out.println(cor.getResults().get(0).toString());

        

    }

}
