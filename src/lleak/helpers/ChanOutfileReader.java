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
public class ChanOutfileReader extends FileReader {

    private ArrayList<ChanOutfileResults> results = new ArrayList<>();

    public ChanOutfileReader() {
    }

    public ChanOutfileReader(String path) {
        readFile(path);
        setResults();
    }

    private void setResults() {
        if (fileInf == null) {
            System.out.println("Error");
        } else {

            for (int i = 0; i < fileInf.size(); i++) {
                String[] split = fileInf.get(i).trim().split("\\s+");
                double t = Double.valueOf(split[0]);
                int j = Integer.valueOf(split[1]);
                double x = Double.valueOf(split[2]);
                double u = Double.valueOf(split[3]);
                double eps1 = Double.valueOf(split[4]);
                double eps2 = Double.valueOf(split[5]);
                double eps3 = Double.valueOf(split[6]);
                double T1 = Double.valueOf(split[7]);
                double T2 = Double.valueOf(split[8]);
                double T3 = Double.valueOf(split[9]);
                double p = Double.parseDouble(split[10].trim());
                double urho = Double.valueOf(split[11]);
                double rho = Double.valueOf(split[12]);
                double rho1 = Double.valueOf(split[13]);
                double rho2 = Double.valueOf(split[14]);
                double rho3 = Double.valueOf(split[15]);
                double gsrc = Double.valueOf(split[16]);
                double sigma1nu = Double.valueOf(split[17]);
                double a1 = Double.valueOf(split[18]);
                double a7 = Double.valueOf(split[19]);
                ChanOutfileResults cor = new ChanOutfileResults(t, j, x, u, eps1, eps2, eps3, T1, T2, T3, p, urho, rho, rho1, rho2, rho3, gsrc, sigma1nu, a1, a7);
                results.add(cor);

            }
        }
    }

    public ArrayList<ChanOutfileResults> getResults() {
        return results;
    }

}
