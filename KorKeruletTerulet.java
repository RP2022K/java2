/*
* File: KorKeruletTerulet.java
* Author: Gyüre Árpád
* Copyright: 2022, Gyüre Árpád
* Group: Szoft I-1-E
* Date: 2022-12-07
* Github: https://github.com/rp2022k/java2
*/

import java.io.*;
public class KorKeruletTerulet {
    public static void main(String[] args) throws IOException{
        double r;

        BufferedReader br=
        new BufferedReader(new InputStreamReader(System.in));

        System.out.print("A kör sugara: ");
        r=Double.parseDouble(br.readLine());

        System.out.println("A kör kerülete: "+String.format("%.3f",(Math.PI*2*r)));
	System.out.println("A kör területe: "+String.format("%.3f",(Math.PI*r*r)));
    }
}
