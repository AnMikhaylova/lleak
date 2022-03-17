/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lleak.helpers;

import java.util.ArrayList;


/**
 *
 * @author tassy
 */
public class TimeReader extends FileReader {

    private int nt = 0;
    private ArrayList<TimeInterval> timeIntervals = new ArrayList<>();

    public TimeReader() {

    }

    public TimeReader(String path) {
        readFile(path);
        nt = Integer.valueOf(fileInf.get(0));
        setTimeIntervals();

    }

    private void setTimeIntervals() {
        if (fileInf == null) {
            System.out.println("Error");
        } else {

            
            for (int i = 1; i <= nt; i++) {
                String[] split = fileInf.get(i).split("\\s+");
                double d = Double.parseDouble(split[1].trim());
                TimeInterval ti = new TimeInterval(Integer.valueOf(split[0]), d, Double.valueOf(split[2]));
                timeIntervals.add(ti);
            }
        }
    }

    public int getNt() {
        return nt;
    }

    public ArrayList<TimeInterval> getTimeIntervals() {
        return timeIntervals;
    }

   
    

}
