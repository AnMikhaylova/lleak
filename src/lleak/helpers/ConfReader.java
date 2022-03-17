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
public class ConfReader extends FileReader {

    private String time = null;
    private String chan = null;
    private String bounds = null;

    public ConfReader() {
    }

    public ConfReader(String path) {
        readFile(path);
        setTime();
        setChan();
        setBounds();

    }

    private void setTime() {
        if (fileInf == null) {
            System.out.println("Error");
        } else {

            String[] time_arr = fileInf.get(0).split(" = ");
            if (time_arr[0].equals("timescen")) {
                time = time_arr[1];
            }

        }
    }

    private void setChan() {

        if (fileInf == null) {
            System.out.println("Error");
        } else {

            String[] chan_arr = fileInf.get(1).split(" = ");
            if (chan_arr[0].equals("profile")) {
                chan = chan_arr[1];
            }

        }
    }

    private void setBounds() {

        if (fileInf == null) {
            System.out.println("Error");
        } else {

            String[] bounds_arr = fileInf.get(2).split(" = ");
            if (bounds_arr[0].equals("bound")) {
                bounds = bounds_arr[1];
            }

        }

    }

    public String getTime() {
        return time;
    }

    public String getChan() {
        return chan;
    }

    public String getBounds() {
        return bounds;
    }

}
