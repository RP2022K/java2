/*
* File: Idotartam.java
* Author: Gyüre Árpád
* Copyright: 2022, Gyüre Árpád
* Group: Szoft I-1-E
* Date: 2022-12-07
* Github: https://github.com/rp2022k/java2
*/

import java.io.*;
public class Idotartam {
    public static void main(String[] args) throws IOException{
        int nap, ora, perc, masodperc;

        BufferedReader br=
        new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Írd be az időtartamot! ");
	System.out.print("nap: ");
        nap=Integer.parseInt(br.readLine());
	System.out.print("óra: ");
        ora=Integer.parseInt(br.readLine());
	System.out.print("perc: ");
        perc=Integer.parseInt(br.readLine());
	System.out.print("másodperc: ");
        masodperc=Integer.parseInt(br.readLine());
	System.out.println("A megadott időtartam másodpercben: "+((nap*86400)+(ora*3600)+(perc*60)+masodperc));
    }
}
