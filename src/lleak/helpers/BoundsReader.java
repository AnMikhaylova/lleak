/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lleak.helpers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author tassy
 */
public class BoundsReader extends FileReader{
    
    private int n = 0;
    private Map<Integer, String> boundFiles = new HashMap<>();
    //ArrayList <String> boundFiles = new ArrayList<>();

    public BoundsReader() {
    }
    
    
    public BoundsReader(String path) {
        readFile(path);
        n = Integer.valueOf(fileInf.get(0));
        setBoundFiles();
        
    }
    
    
    private void setBoundFiles() {
         if (fileInf == null) {
            System.out.println("Error");
        } else {

            
            for (int i = 1; i <= n; i++) {
                String[] split = fileInf.get(i).split("\\s+");
                boundFiles.put(Integer.valueOf(split[0]), split[1]);
            }
        }
    }

    public int getN() {
        return n;
    }

    public Map<Integer, String> getBoundFiles() {
        return boundFiles;
    }

  
    
    
}

