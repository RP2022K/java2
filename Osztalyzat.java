/*
* File: Osztalyzat.java
* Author: Gyüre Árpád
* Copyright: 2022, Gyüre Árpád
* Group: Szoft I-1-E
* Date: 2022-12-08
* Github: https://github.com/rp2022k/java2
*/

import java.io.*;
public class Osztalyzat {
    public static void main(String[] args) throws IOException{

	String ertekeles;

        BufferedReader br=
        new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Írd be az osztályzatot: ");
        int osztalyzat=Integer.parseInt(br.readLine());
        
        switch (osztalyzat){
           case 1: ertekeles="elégtelen"; break;
           case 2: ertekeles="elégséges"; break;
           case 3: ertekeles="közepes";  break;
           case 4: ertekeles="jó"; break;
           case 5: ertekeles="jeles"; break;
           default: ertekeles="";
        }
	System.out.println("Értékelés: "+ertekeles);
    }
}
