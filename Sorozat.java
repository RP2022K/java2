/*
* File: Sorozat.java
* Author: Gyüre Árpád
* Copyright: 2022, Gyüre Árpád
* Group: Szoft I-1-E
* Date: 2022-12-13
* Github: https://github.com/rp2022k/java2
*/

import java.io.*;
import java.util.*;
public class Sorozat {
    public static void main(String[] args) throws IOException{
	
	String[] sorozat = new String[15];
	int szamjegy;

	sorozat[0] = "1";
	for (int i=1;i<15;i++){
		sorozat[i]="";
	}
	//System.out.println(1+" : "+(String.valueOf(sorozat[0])));
	for (int i = 1; i <15; i++) {
		for (int j=1;j<=sorozat[i-1].length();j++){
			szamjegy = Integer.parseInt(String.valueOf(sorozat[i-1].charAt(j-1)))*2;
			sorozat[i] = sorozat[i] + String.valueOf(szamjegy);
		}
	//System.out.println((i+1)+" : "+(String.valueOf(sorozat[i])));
	}
	System.out.println("A sorozat 15.eleme: "+(String.valueOf(sorozat[14])));
    }
}
