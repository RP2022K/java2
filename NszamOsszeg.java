/*
* File: NszamOsszeg.java
* Author: Gyüre Árpád
* Copyright: 2022, Gyüre Árpád
* Group: Szoft I-1-E
* Date: 2022-12-11
* Github: https://github.com/rp2022k/java2
*/

import java.io.*;
import java.util.*;
public class NszamOsszeg {
    public static void main(String[] args) throws IOException{

	int osszeg = 0;
	int n;

        BufferedReader br=
        new BufferedReader(new InputStreamReader(System.in));
	
	System.out.print("n= ");
	n = Integer.parseInt(br.readLine());
	for (int i=1;i<=n;i++){
		osszeg = osszeg + i;
	}
	System.out.println("n szám összege: "+ osszeg);
    }
}
