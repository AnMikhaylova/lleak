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
public class ChanProfReader extends FileReader{
    
    private int n = 0;
    private ArrayList<ChanProf> chans = new ArrayList<>();

    public ChanProfReader() {
    }
    
    public ChanProfReader(String path) {
        readFile(path);
        n = Integer.valueOf(fileInf.get(0));
        setChans();
        
    }
    
    private void setChans(){
        if (fileInf == null) {
            System.out.println("Error");
        } else {

            
            for (int i = 1; i <= n*2; i++) {
                String[] split = fileInf.get(i).trim().split("\\s+");
                if((split.length == 2) && (Integer.valueOf(split[1]) == 1)) {
                    
                    String[] split1 = fileInf.get(i+1).trim().split("\\s+");
                    ChanProf ch = new ChanProf(Integer.valueOf(split[0]), Integer.valueOf(split1[0]), Integer.valueOf(split1[1]), split1[2]);
                    chans.add(ch);
                    
                }
                i++;
                
            }
        }
    }

    public int getN() {
        return n;
    }

    public ArrayList<ChanProf> getChans() {
        return chans;
    }
    
    
    
    
}
