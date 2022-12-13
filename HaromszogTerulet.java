/*
* File: HaromszogTerulet.java
* Author: Gyüre Árpád
* Copyright: 2022, Gyüre Árpád
* Group: Szoft I-1-E
* Date: 2022-12-07
* Github: https://github.com/rp2022k/java2
*/

import java.io.*;
public class HaromszogTerulet {
    public static void main(String[] args) throws IOException{
        double oldalhossz, magassag;

        BufferedReader br=
        new BufferedReader(new InputStreamReader(System.in));

        System.out.print("A háromszög egyik oldalának hossza: ");
        oldalhossz=Double.parseDouble(br.readLine());
	System.out.print("Az oldalhoz tartozó magasság: ");
        magassag=Double.parseDouble(br.readLine());
	System.out.println("A héromszög területe: "+String.format("%.3f",(oldalhossz*magassag/2)));
    }
}
