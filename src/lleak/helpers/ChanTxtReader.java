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
public class ChanTxtReader extends FileReader{

    private String outfile = null;
    private String geom = null;

    public ChanTxtReader() {
    }
    
    public ChanTxtReader(String path) {
        readFile(path);
        setOutfile();
        setGeom();
        
    }
    
    private void setOutfile() {
        if (fileInf == null) {
            System.out.println("Error");
        } else {

            String[] time_arr = fileInf.get(0).split(" = ");
            if (time_arr[0].equals("outfile")) {
                outfile = time_arr[1];
            }

        }
    }

    private void setGeom() {

        if (fileInf == null) {
            System.out.println("Error");
        } else {

            String[] chan_arr = fileInf.get(1).split(" = ");
            if (chan_arr[0].equals("geom")) {
                geom = chan_arr[1];
            }

        }
    }

    public String getOutfile() {
        return outfile;
    }

    public String getGeom() {
        return geom;
    }

    @Override
    public String toString() {
        return ("Outfile:" + getOutfile() + " Geom:" + getGeom());
    }
    
    
    
    
    

}
